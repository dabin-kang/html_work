import React, { useMemo,useState } from 'react';

// = Memo는 최적화의 이야기

function UseMemoGo(props) {

    const[list,setList] = useState([11,22,33,44])
    const[num,setNum] = useState(10)

    function numChange(e){
        console.log('numChange 실행',e.taget.value)
        setNum(e.target.value)
    }

    function listAdd(){
        console.log('listAdd실행')
        setList([...list,88])
    }

    function goToT(){
        console.log("goToT실행")

        let ret = 0
        for(const i of list){
            ret += i
        }
        return ret
    }

    // let tot = goToT()
    // useMemo(실행할 함수, [내용 변경시 함수실행 할 변수 ])
    // list 변경시 goToT 실행
    // num 변경시에는 goToT 실행안함
    let tot = useMemo(goToT,[list]) 

    return (
        <div>
            <h1>UseMemoGo입니다</h1>
            <div>num<input value={num} onChange={numChange}/></div>
            <div>list : {list.join(',')}</div>
            <button onClick={listAdd}>list추가</button>
            <div>tot : {tot}</div>
        </div>
    );
}

export default UseMemoGo;