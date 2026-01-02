import React, { useState, useEffect } from 'react';
import { Crown, Swords, Shield, Zap, Heart, Eye, Flame, Droplet, Wind, Mountain, Clock } from 'lucide-react';

const BOARD_WIDTH = 8;
const BOARD_HEIGHT = 16;

// 유닛 데이터 정의
const UNIT_TEMPLATES = {
  // 폰 랭크 (6개 필요)
  pawn_water: {
    rank: 'pawn',
    name: '물의 치유사',
    element: 'water',
    hp: 30,
    maxHp: 30,
    damage: 4,
    move: 1,
    sight: 2,
    ability: '매 턴 체력 2 회복',
    icon: '💧',
    color: '#3b82f6'
  },
  pawn_fire: {
    rank: 'pawn',
    name: '화염 전사',
    element: 'fire',
    hp: 25,
    maxHp: 25,
    damage: 6,
    move: 1,
    sight: 2,
    ability: '공격 시 추가 화상 2',
    icon: '🔥',
    color: '#ef4444'
  },
  pawn_earth: {
    rank: 'pawn',
    name: '대지의 수호자',
    element: 'earth',
    hp: 35,
    maxHp: 35,
    damage: 3,
    move: 1,
    sight: 2,
    ability: '받는 피해 -1',
    icon: '🪨',
    color: '#78716c'
  },
  pawn_wind: {
    rank: 'pawn',
    name: '바람의 정찰병',
    element: 'wind',
    hp: 20,
    maxHp: 20,
    damage: 4,
    move: 2,
    sight: 3,
    ability: '이동력 +1, 시야 +1',
    icon: '💨',
    color: '#06b6d4'
  },
  
  // 나이트 랭크 (2개 필요)
  knight_assault: {
    rank: 'knight',
    name: '돌격 기사',
    hp: 45,
    maxHp: 45,
    damage: 8,
    move: 2,
    sight: 2,
    ability: '2칸 직선 돌진 공격',
    icon: '⚔️',
    color: '#8b5cf6'
  },
  knight_defender: {
    rank: 'knight',
    name: '방어 기사',
    hp: 50,
    maxHp: 50,
    damage: 6,
    move: 1,
    sight: 2,
    ability: '인접 아군 피해 -2',
    icon: '🛡️',
    color: '#6366f1'
  },
  
  // 룩 랭크 (2개 필요)
  rook_cannon: {
    rank: 'rook',
    name: '공성 포차',
    hp: 40,
    maxHp: 40,
    damage: 12,
    move: 1,
    sight: 4,
    ability: '3칸 직선 원거리 공격',
    icon: '🏹',
    color: '#ec4899'
  },
  rook_fortress: {
    rank: 'rook',
    name: '요새 수호병',
    hp: 60,
    maxHp: 60,
    damage: 5,
    move: 1,
    sight: 3,
    ability: '이동하지 않으면 방어 +3',
    icon: '🏰',
    color: '#a855f7'
  },
  
  // 킹 랭크 (1개 필요)
  king_commander: {
    rank: 'king',
    name: '왕국의 지휘관',
    hp: 70,
    maxHp: 70,
    damage: 10,
    move: 2,
    sight: 3,
    ability: '주변 2칸 아군 공격력 +2',
    icon: '👑',
    color: '#fbbf24'
  },
  
  // 퀸 랭크 (1개 필요)
  queen_strategist: {
    rank: 'queen',
    name: '전략의 여왕',
    hp: 55,
    maxHp: 55,
    damage: 8,
    move: 2,
    sight: 4,
    ability: '모든 방향 이동, 시야 공유',
    icon: '👸',
    color: '#f59e0b'
  }
};

const TacticalBoardGame = () => {
  const [gamePhase, setGamePhase] = useState('setup'); // setup, ready, battle, end
  const [currentPlayer, setCurrentPlayer] = useState(1);
  const [board, setBoard] = useState([]);
  const [players, setPlayers] = useState({
    1: { hp: 100, maxHp: 100, pos: null, timeLeft: 180 },
    2: { hp: 100, maxHp: 100, pos: null, timeLeft: 180 }
  });
  const [selectedUnit, setSelectedUnit] = useState(null);
  const [selectedSetupUnit, setSelectedSetupUnit] = useState(null);
  const [setupUnits, setSetupUnits] = useState({
    1: [],
    2: []
  });
  const [movedUnits, setMovedUnits] = useState(new Set());
  const [visibleCells, setVisibleCells] = useState(new Set());
  const [graveyard, setGraveyard] = useState({ 1: [], 2: [] });
  const [setupComplete, setSetupComplete] = useState({ 1: false, 2: false });
  const [possibleMoves, setPossibleMoves] = useState([]);
  const [winner, setWinner] = useState(null);

  // 타이머
  useEffect(() => {
    if (gamePhase !== 'battle') return;
    
    const timer = setInterval(() => {
      setPlayers(prev => {
        const newPlayers = { ...prev };
        newPlayers[currentPlayer].timeLeft -= 1;
        
        if (newPlayers[currentPlayer].timeLeft <= 0) {
          endGame(currentPlayer === 1 ? 2 : 1, '시간 초과');
        }
        
        return newPlayers;
      });
    }, 1000);
    
    return () => clearInterval(timer);
  }, [gamePhase, currentPlayer]);

  // 초기화
  useEffect(() => {
    initBoard();
  }, []);

  const initBoard = () => {
    const newBoard = Array(BOARD_HEIGHT).fill(null).map(() => 
      Array(BOARD_WIDTH).fill(null)
    );
    setBoard(newBoard);
  };

  // 배치 가능한 유닛 목록
  const getAvailableUnits = () => {
    return Object.keys(UNIT_TEMPLATES).map(key => ({
      id: key,
      ...UNIT_TEMPLATES[key]
    }));
  };

  // 유닛 배치
  const placeUnit = (row, col) => {
    if (gamePhase !== 'setup' || !selectedSetupUnit) return;
    
    const player = currentPlayer;
    const deployZone = player === 1 ? [0, 1, 2] : [13, 14, 15];
    
    if (!deployZone.includes(row)) return;
    if (board[row][col]) return;
    if (setupUnits[player].length >= 12) return;

    const newUnit = {
      ...UNIT_TEMPLATES[selectedSetupUnit],
      id: `${selectedSetupUnit}_${Date.now()}`,
      player,
      pos: { row, col },
      hasMoved: false
    };

    const newBoard = board.map(r => [...r]);
    newBoard[row][col] = newUnit;
    setBoard(newBoard);
    
    setSetupUnits({
      ...setupUnits,
      [player]: [...setupUnits[player], newUnit]
    });
  };

  // 플레이어 배치
  const placePlayer = (row, col) => {
    if (gamePhase !== 'setup') return;
    if (board[row][col]) return;
    
    const player = currentPlayer;
    const deployZone = player === 1 ? [0, 1, 2] : [13, 14, 15];
    
    if (!deployZone.includes(row)) return;
    if (players[player].pos) return;

    const newBoard = board.map(r => [...r]);
    newBoard[row][col] = { type: 'player', player };
    setBoard(newBoard);
    
    setPlayers({
      ...players,
      [player]: { ...players[player], pos: { row, col } }
    });
  };

  // 배치 완료 검증
  const validateSetup = (player) => {
    const units = setupUnits[player];
    const counts = {
      pawn: 0,
      knight: 0,
      rook: 0,
      king: 0,
      queen: 0
    };
    
    units.forEach(u => counts[u.rank]++);
    
    return counts.pawn >= 6 && 
           counts.knight >= 2 && 
           counts.rook >= 2 && 
           counts.king >= 1 && 
           counts.queen >= 1 &&
           players[player].pos !== null;
  };

  // 배치 완료
  const finishSetup = () => {
    if (!validateSetup(currentPlayer)) {
      alert('필수 유닛을 모두 배치해주세요!\n폰 6개, 나이트 2개, 룩 2개, 킹 1개, 퀸 1개, 플레이어 배치 필요');
      return;
    }
    
    const newSetupComplete = { ...setupComplete, [currentPlayer]: true };
    setSetupComplete(newSetupComplete);
    
    if (currentPlayer === 1) {
      setCurrentPlayer(2);
      alert('플레이어 2의 배치 차례입니다');
    } else {
      setGamePhase('ready');
    }
  };

  // 게임 시작
  const startGame = () => {
    if (!setupComplete[1] || !setupComplete[2]) {
      alert('두 플레이어 모두 배치를 완료해야 합니다!');
      return;
    }
    
    setGamePhase('battle');
    setCurrentPlayer(1);
    updateVision();
  };

  // 시야 계산
  const updateVision = () => {
    const visible = new Set();
    
    for (let row = 0; row < BOARD_HEIGHT; row++) {
      for (let col = 0; col < BOARD_WIDTH; col++) {
        const cell = board[row][col];
        if (cell && cell.player === currentPlayer) {
          const sight = cell.type === 'player' ? 2 : cell.sight;
          
          for (let dr = -sight; dr <= sight; dr++) {
            for (let dc = -sight; dc <= sight; dc++) {
              const newRow = row + dr;
              const newCol = col + dc;
              if (newRow >= 0 && newRow < BOARD_HEIGHT && 
                  newCol >= 0 && newCol < BOARD_WIDTH) {
                visible.add(`${newRow},${newCol}`);
              }
            }
          }
        }
      }
    }
    
    setVisibleCells(visible);
  };

  // 이동 가능한 칸 계산
  const calculatePossibleMoves = (row, col, unit) => {
    const moves = [];
    const moveRange = unit.type === 'player' ? 1 : unit.move;
    
    // 상하좌우 이동
    const directions = [[-1, 0], [1, 0], [0, -1], [0, 1]];
    
    for (const [dr, dc] of directions) {
      for (let dist = 1; dist <= moveRange; dist++) {
        const newRow = row + dr * dist;
        const newCol = col + dc * dist;
        
        if (newRow < 0 || newRow >= BOARD_HEIGHT || 
            newCol < 0 || newCol >= BOARD_WIDTH) break;
        
        const targetCell = board[newRow][newCol];
        
        // 아군이 있으면 막힘
        if (targetCell && targetCell.player === currentPlayer) break;
        
        // 적이 있으면 공격 가능 (이동은 불가)
        if (targetCell && targetCell.player !== currentPlayer) {
          moves.push({ row: newRow, col: newCol, type: 'attack' });
          break;
        }
        
        // 빈 칸은 이동 가능
        moves.push({ row: newRow, col: newCol, type: 'move' });
      }
    }
    
    return moves;
  };

  // 유닛 선택
  const selectUnit = (row, col) => {
    if (gamePhase !== 'battle') return;
    
    const cell = board[row][col];
    if (!cell || cell.player !== currentPlayer) {
      setSelectedUnit(null);
      setPossibleMoves([]);
      return;
    }
    
    if (cell.type === 'player' || !movedUnits.has(cell.id)) {
      setSelectedUnit({ row, col, unit: cell });
      const moves = calculatePossibleMoves(row, col, cell);
      setPossibleMoves(moves);
    }
  };

  // 이동 또는 공격
  const moveOrAttack = (toRow, toCol) => {
    if (!selectedUnit) return;
    
    const move = possibleMoves.find(m => m.row === toRow && m.col === toCol);
    if (!move) return;
    
    const { row: fromRow, col: fromCol, unit } = selectedUnit;
    const target = board[toRow][toCol];
    
    if (move.type === 'attack' && target) {
      attack(fromRow, fromCol, toRow, toCol, unit, target);
    } else if (move.type === 'move') {
      moveUnit(fromRow, fromCol, toRow, toCol, unit);
    }
  };

  // 이동
  const moveUnit = (fromRow, fromCol, toRow, toCol, unit) => {
    const newBoard = board.map(r => [...r]);
    newBoard[fromRow][fromCol] = null;
    newBoard[toRow][toCol] = { ...unit, pos: { row: toRow, col: toCol } };
    setBoard(newBoard);
    
    if (unit.type === 'player') {
      setPlayers({
        ...players,
        [currentPlayer]: { ...players[currentPlayer], pos: { row: toRow, col: toCol } }
      });
    } else {
      setMovedUnits(new Set([...movedUnits, unit.id]));
    }
    
    setSelectedUnit(null);
    setPossibleMoves([]);
    updateVision();
  };

  // 공격
  const attack = (fromRow, fromCol, toRow, toCol, attacker, defender) => {
    const newBoard = board.map(r => [...r]);
    let damage = attacker.type === 'player' ? 10 : attacker.damage;
    
    // 대지 속성 방어
    if (defender.element === 'earth' && defender.type !== 'player') {
      damage = Math.max(1, damage - 1);
    }
    
    // 화염 속성 추가 데미지
    if (attacker.element === 'fire') {
      damage += 2;
    }
    
    // 방어자가 플레이어인 경우
    if (defender.type === 'player') {
      const newPlayers = { ...players };
      newPlayers[defender.player].hp -= damage;
      setPlayers(newPlayers);
      
      if (newPlayers[defender.player].hp <= 0) {
        endGame(currentPlayer, '플레이어 처치');
      }
    } 
    // 방어자가 유닛인 경우
    else {
      const newHp = defender.hp - damage;
      
      if (newHp <= 0) {
        newBoard[toRow][toCol] = null;
        const newGraveyard = {
          ...graveyard,
          [defender.player]: [...graveyard[defender.player], defender]
        };
        setGraveyard(newGraveyard);
        
        // 모든 유닛 제거 체크
        const hasUnits = newBoard.some(row => 
          row.some(cell => cell && cell.player === defender.player && cell.type !== 'player')
        );
        
        if (!hasUnits) {
          endGame(currentPlayer, '전멸');
        }
      } else {
        newBoard[toRow][toCol] = { ...defender, hp: newHp };
      }
    }
    
    setBoard(newBoard);
    
    if (attacker.type !== 'player') {
      setMovedUnits(new Set([...movedUnits, attacker.id]));
    }
    
    setSelectedUnit(null);
    setPossibleMoves([]);
    updateVision();
  };

  // 턴 종료
  const endTurn = () => {
    // 물 속성 폰 회복
    const newBoard = board.map(r => [...r]);
    for (let row = 0; row < BOARD_HEIGHT; row++) {
      for (let col = 0; col < BOARD_WIDTH; col++) {
        const cell = newBoard[row][col];
        if (cell && cell.player === currentPlayer && cell.element === 'water') {
          cell.hp = Math.min(cell.maxHp, cell.hp + 2);
        }
      }
    }
    setBoard(newBoard);
    
    setCurrentPlayer(currentPlayer === 1 ? 2 : 1);
    setMovedUnits(new Set());
    setSelectedUnit(null);
    setPossibleMoves([]);
  };

  useEffect(() => {
    if (gamePhase === 'battle') {
      updateVision();
    }
  }, [currentPlayer, board, gamePhase]);

  const endGame = (winnerPlayer, reason) => {
    setGamePhase('end');
    setWinner({ player: winnerPlayer, reason });
  };

  const resetGame = () => {
    initBoard();
    setGamePhase('setup');
    setCurrentPlayer(1);
    setPlayers({
      1: { hp: 100, maxHp: 100, pos: null, timeLeft: 180 },
      2: { hp: 100, maxHp: 100, pos: null, timeLeft: 180 }
    });
    setSelectedUnit(null);
    setSelectedSetupUnit(null);
    setSetupUnits({ 1: [], 2: [] });
    setMovedUnits(new Set());
    setVisibleCells(new Set());
    setGraveyard({ 1: [], 2: [] });
    setSetupComplete({ 1: false, 2: false });
    setPossibleMoves([]);
    setWinner(null);
  };

  const isCellVisible = (row, col) => {
    return visibleCells.has(`${row},${col}`);
  };

  const formatTime = (seconds) => {
    const mins = Math.floor(seconds / 60);
    const secs = seconds % 60;
    return `${mins}:${secs.toString().padStart(2, '0')}`;
  };

  return (
    <div className="w-full min-h-screen bg-gray-900 text-white p-4 overflow-auto">
      <div className="max-w-7xl mx-auto">
        <h1 className="text-3xl font-bold mb-4 text-center">전술 보드 게임</h1>
        
        {/* 게임 종료 모달 */}
        {gamePhase === 'end' && winner && (
          <div className="fixed inset-0 bg-black bg-opacity-75 flex items-center justify-center z-50">
            <div className="bg-gray-800 p-8 rounded-lg text-center">
              <h2 className="text-4xl font-bold mb-4">
                {winner.player === currentPlayer ? '🎉 승리!' : '😢 패배'}
              </h2>
              <p className="text-xl mb-2">플레이어 {winner.player} 승리</p>
              <p className="text-gray-400 mb-6">{winner.reason}</p>
              <button
                onClick={resetGame}
                className="px-6 py-3 bg-blue-600 hover:bg-blue-700 rounded-lg font-bold text-lg"
              >
                다시하기
              </button>
            </div>
          </div>
        )}
        
        {/* 게임 정보 */}
        <div className="mb-4 flex justify-between items-center bg-gray-800 p-4 rounded">
          <div>
            <div className="text-xl font-bold">
              {gamePhase === 'setup' ? '배치 단계' : 
               gamePhase === 'ready' ? '게임 준비' : 
               gamePhase === 'battle' ? '전투 단계' : '게임 종료'}
            </div>
            <div className="text-sm text-gray-400">
              {gamePhase === 'battle' && `현재 플레이어: ${currentPlayer}`}
            </div>
          </div>
          
          <div className="flex gap-4">
            <div className="text-center">
              <div className="text-xs text-gray-400">플레이어 1</div>
              <div className="flex items-center gap-2">
                <Heart className="w-4 h-4 text-red-500" />
                <span>{players[1].hp}/{players[1].maxHp}</span>
              </div>
              {gamePhase === 'battle' && (
                <div className="flex items-center gap-1 text-sm">
                  <Clock className="w-3 h-3" />
                  <span className={currentPlayer === 1 && players[1].timeLeft < 30 ? 'text-red-500' : ''}>
                    {formatTime(players[1].timeLeft)}
                  </span>
                </div>
              )}
            </div>
            <div className="text-center">
              <div className="text-xs text-gray-400">플레이어 2</div>
              <div className="flex items-center gap-2">
                <Heart className="w-4 h-4 text-red-500" />
                <span>{players[2].hp}/{players[2].maxHp}</span>
              </div>
              {gamePhase === 'battle' && (
                <div className="flex items-center gap-1 text-sm">
                  <Clock className="w-3 h-3" />
                  <span className={currentPlayer === 2 && players[2].timeLeft < 30 ? 'text-red-500' : ''}>
                    {formatTime(players[2].timeLeft)}
                  </span>
                </div>
              )}
            </div>
          </div>
        </div>

        <div className="flex gap-4">
          {/* 유닛 선택 패널 (배치 단계) */}
          {gamePhase === 'setup' && (
            <div className="w-64 bg-gray-800 p-4 rounded max-h-screen overflow-y-auto">
              <h3 className="font-bold mb-2">유닛 선택</h3>
              <div className="text-xs text-gray-400 mb-3">
                배치된 유닛: {setupUnits[currentPlayer].length}/12
              </div>
              
              <button
                onClick={() => setSelectedSetupUnit('player')}
                className={`w-full p-2 mb-2 rounded ${
                  selectedSetupUnit === 'player' ? 'bg-yellow-600' : 'bg-gray-700'
                }`}
              >
                플레이어 배치
              </button>
              
              {getAvailableUnits().map(unit => (
                <button
                  key={unit.id}
                  onClick={() => setSelectedSetupUnit(unit.id)}
                  className={`w-full p-2 mb-2 rounded text-left ${
                    selectedSetupUnit === unit.id ? 'bg-blue-600' : 'bg-gray-700'
                  }`}
                  style={{ borderLeft: `4px solid ${unit.color}` }}
                >
                  <div className="flex items-center gap-2">
                    <span className="text-xl">{unit.icon}</span>
                    <div className="flex-1">
                      <div className="text-sm font-bold">{unit.name}</div>
                      <div className="text-xs text-gray-400">
                        HP:{unit.hp} DMG:{unit.damage}
                      </div>
                    </div>
                  </div>
                </button>
              ))}
              
              <button
                onClick={finishSetup}
                className="w-full mt-4 p-3 bg-green-600 hover:bg-green-700 rounded font-bold"
              >
                배치 완료
              </button>
            </div>
          )}

          {/* 게임 시작 버튼 */}
          {gamePhase === 'ready' && (
            <div className="w-64 bg-gray-800 p-4 rounded">
              <h3 className="font-bold mb-4">게임 준비 완료</h3>
              <p className="text-sm text-gray-400 mb-4">
                모든 플레이어가 배치를 완료했습니다.
              </p>
              <button
                onClick={startGame}
                className="w-full p-4 bg-green-600 hover:bg-green-700 rounded font-bold text-lg"
              >
                게임 시작
              </button>
            </div>
          )}

          {/* 보드 */}
          <div className="flex-1">
            <div className="inline-block bg-gray-800 p-2 rounded">
              {board.map((row, rowIdx) => (
                <div key={rowIdx} className="flex">
                  {row.map((cell, colIdx) => {
                    const isVisible = gamePhase !== 'battle' || isCellVisible(rowIdx, colIdx);
                    const isSelected = selectedUnit && 
                      selectedUnit.row === rowIdx && 
                      selectedUnit.col === colIdx;
                    const isDeployZone = gamePhase === 'setup' && 
                      ((currentPlayer === 1 && rowIdx <= 2) ||
                       (currentPlayer === 2 && rowIdx >= 13));
                    const isPossibleMove = possibleMoves.find(m => m.row === rowIdx && m.col === colIdx);
                    
                    return (
                      <div
                        key={colIdx}
                        onClick={() => {
                          if (gamePhase === 'setup') {
                            if (selectedSetupUnit === 'player') {
                              placePlayer(rowIdx, colIdx);
                            } else {
                              placeUnit(rowIdx, colIdx);
                            }
                          } else if (gamePhase === 'battle') {
                            if (selectedUnit && isPossibleMove) {
                              moveOrAttack(rowIdx, colIdx);
                            } else {
                              selectUnit(rowIdx, colIdx);
                            }
                          }
                        }}
                        className={`
                          w-12 h-12 border border-gray-600 flex items-center justify-center
                          cursor-pointer relative
                          ${(rowIdx + colIdx) % 2 === 0 ? 'bg-gray-700' : 'bg-gray-600'}
                          ${isSelected ? 'ring-2 ring-yellow-400' : ''}
                          ${isDeployZone ? 'bg-blue-900' : ''}
                          ${!isVisible ? 'bg-black' : ''}
                          ${isPossibleMove?.type === 'move' ? 'bg-green-600' : ''}
                          ${isPossibleMove?.type === 'attack' ? 'bg-red-600' : ''}
                        `}
                      >
                        {isVisible ? (
                          cell ? (
                            cell.type === 'player' ? (
                              <div className="flex flex-col items-center">
                                <Crown 
                                  className="w-6 h-6" 
                                  style={{ color: cell.player === 1 ? '#3b82f6' : '#ef4444' }}
                                />
                                <div className="text-xs">{players[cell.player].hp}</div>
                              </div>
                            ) : (
                              <div className="flex flex-col items-center">
                                <span className="text-2xl">{cell.icon}</span>
                                <div className="text-xs">{cell.hp}</div>
                                {movedUnits.has(cell.id) && (
                                  <div className="absolute top-0 right-0 w-2 h-2 bg-gray-500 rounded-full"></div>
                                )}
                              </div>
                            )
                          ) : null
                        ) : (
                          <div className="text-gray-800">?</div>
                        )}
                      </div>
                    );
                  })}
                </div>
              ))}
            </div>
          </div>

          {/* 정보 패널 */}
          <div className="w-64 bg-gray-800 p-4 rounded space-y-4">
            {selectedUnit && gamePhase === 'battle' && (
              <div className="bg-gray-700 p-3 rounded">
                <h3 className="font-bold mb-2">선택된 유닛</h3>
                {selectedUnit.unit.type === 'player' ? (
                  <div>
                    <div className="font-bold">플레이어 {selectedUnit.unit.player}</div>
                    <div className="text-sm text-gray-300 mt-2">
                      HP: {players[selectedUnit.unit.player].hp}/{players[selectedUnit.unit.player].maxHp}
                    </div>
                    <div className="text-sm text-gray-300">
                      이동: 상하좌우 1칸
                    </div>
                  </div>
                ) : (
                  <div>
                    <div className="text-xl mb-2">{selectedUnit.unit.icon}</div>
                    <div className="font-bold">{selectedUnit.unit.name}</div>
                    <div className="text-sm text-gray-300 mt-2">
                      HP: {selectedUnit.unit.hp}/{selectedUnit.unit.maxHp}
                    </div>
                    <div className="text-sm text-gray-300">
                      공격력: {selectedUnit.unit.damage}
                    </div>
                    <div className="text-sm text-gray-300">
                      이동: {selectedUnit.unit.move}
                    </div>
                    <div className="text-sm text-gray-300">
                      시야: {selectedUnit.unit.sight}
                    </div>
                    <div className="text-xs text-gray-400 mt-2">
                      {selectedUnit.unit.ability}
                    </div>
                  </div>
                )}
              </div>
            )}
            
            {gamePhase === 'battle' && (
              <button
                onClick={endTurn}
                className="w-full p-3 bg-blue-600 hover:bg-blue-700 rounded font-bold"
              >
                턴 종료
              </button>
            )}
            
            <div className="bg-gray-700 p-3 rounded">
              <h3 className="font-bold mb-2">묘지</h3>
              <div className="space-y-2">
                <div>
                  <div className="text-xs text-gray-400">플레이어 1</div>
                  <div className="flex flex-wrap gap-1">
                    {graveyard[1].map((unit, idx) => (
                      <span key={idx} className="text-lg opacity-50">{unit.icon}</span>
                    ))}
                  </div>
                </div>
                <div>
                  <div className="text-xs text-gray-400">플레이어 2</div>
                  <div className="flex flex-wrap gap-1">
                    {graveyard[2].map((unit, idx) => (
                      <span key={idx} className="text-lg opacity-50">{unit.icon}</span>
                    ))}
                  </div>
                </div>
              </div>
            </div>
            
            {gamePhase === 'battle' && (
              <div className="bg-gray-700 p-3 rounded">
                <h3 className="font-bold mb-2">조작법</h3>
                <div className="text-xs text-gray-300 space-y-1">
                  <p>• 유닛 클릭: 선택</p>
                  <p>• 녹색 칸: 이동 가능</p>
                  <p>• 빨간 칸: 공격 가능</p>
                  <p>• 회색 점: 행동 완료</p>
                </div>
              </div>
            )}
          </div>
        </div>
      </div>
    </div>
  );
};

export default TacticalBoardGame;