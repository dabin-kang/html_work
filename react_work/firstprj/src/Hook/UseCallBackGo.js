import React, { useCallback, useEffect, useRef, useState } from 'react';

// 전역으로 사용하려고 밖에서 변수선언
let no =0
function UseCallBackGo(props) {

    //함수형 state 만들기
    const[aa,setAA] = useState(no)
    const[bb,setbb] = useState(100)
    

    //fn_1 변수를 화살표 함수로 선언
    const fn_1=()=>{
        console.log('fn_1실행:')
    }

    //,[] 빈 배열 렌더링 시 예외처리 됨
    const fn_2= useCallback(()=>{
        console.log('fn_2실행:')
    },[])// 결합시 생성후 재생성 안함

    //아무때나 다 되라
    const fn_3= useCallback(()=>{
        console.log('fn_3실행:')
    })// 랜더링시 마다 재생성 함

    //bb가 바뀔 때 마다 재정의 해라
    const fn_4= useCallback(()=>{
        console.log('fn_4실행:')
    },[bb])//bb 변경시 재생성 함

    //fn_1()

    //이전 함수와 현재 함수 비교
    //useRef : 랜더링과 관계없이 유지, 변경가능한 저장소
    // 리렌더링시 이전 값 유지
    const myRef = useRef({fn_1,fn_2,fn_3,fn_4})

    //컴포넌트 결합 리렌더링시 실행
    useEffect(()=>{
        console.log('useEffect 실행 => 컴포넌트 결합,리렌더링')
  
        console.log(myRef.current.fn_1=== fn_1 ? 'fn_1 재생성하지 않음 ': 'fn_1 재생성 됨')
        console.log(myRef.current.fn_2=== fn_2 ? 'fn_2 재생성하지 않음 ': 'fn_2 재생성 됨')
        console.log(myRef.current.fn_3=== fn_3 ? 'fn_3 재생성하지 않음 ': 'fn_3 재생성 됨')
        console.log(myRef.current.fn_4=== fn_4 ? 'fn_4 재생성하지 않음 ': 'fn_4 재생성 됨')
        
        //확인 후 현재 함수들로 대입: 다음 렌더링시 현재의 함수와 렌더링 후 함수와 비교하기 위해서
        myRef.current.fn_1 = fn_1 
        myRef.current.fn_2 = fn_2
        myRef.current.fn_3 = fn_3
        myRef.current.fn_4 = fn_4
    })

    //컴포넌트 결합시에만 실행
    // useEffect(()=>{
    //     console.log('useEffect 실행 => 컴포넌트 결합')
    //     myRef.current = {fn_1, fn_2} // 컴포넌트 결합시에만 myRef 에 fn_2를 저장
    // },[])


    //함수 존재 유무 확인 -- useCallBack 으로 함수 재생성 되었는지 파악 불가
    //true , false로 확인 하는 단계
    console.log('fn_1:', typeof fn_1==='function')
    console.log('fn_2:', typeof fn_2==='function')

    return (
        <div>
            <h1>UseCallBackGo</h1>
            {/* aa = state 기본상태 값 */}
            <div>aa:{aa}</div>
            <div>bb:{bb}</div>

            {/* 버튼 생성
            버튼을 누르면 SetAA로 +1이 되도록 한다
            */}
            <button onClick={()=>setAA(aa+1)}>aa증가</button>
            <button onClick={()=>setbb(bb+1)}>bb증가</button>
        </div>
    );
}

export default UseCallBackGo;