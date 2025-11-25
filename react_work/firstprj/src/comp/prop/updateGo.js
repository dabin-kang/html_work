//화면 갱신 타이밍

// @ts-check

import { useState } from "react"
import './updateGo.css'

let no1 = 0
let no2 = 0
let boxToggle = true


/**
 * @param {{ pname: string, age: number, marriage: boolean }} props
 */
function Ootd({ pname, age, marriage }) {

    let no4 = 0
    no4++ // 재랜더링시 선언, 1로증가(더이상 증가를 못함)


    no1++ // 최초 1회만 실행 됨, 누적증가
    console.log('화면그리기', no1)//재랜더링 실행

    // state : 변수 대입 및 화면갱신
    const [no3, setNo3] = useState(100) //변수명은 : no3, 변수값 변경함수: setNo3(매개변수), 초기값 : 100
    const [noAge, setNoAge] = useState(age)
    const [box, setBox] = useState('box_y')

    function btnGo1() {
        no2++
        console.log('btnGo2눌렀다', no2)
    }

    function btnGo3() {
        setNo3(no3 + 1) // useState로 지정한 setNo3() 함수 호출시
        // state:no3 값을 매개변수로 대입
        // 재랜더링
        console.log('btnGo3눌렀다', no3)
    }


    function btnGoNoAge() {// props는 상수 : 읽기전용 변경되지 않음
        setNoAge((prev) => prev + 1);
        console.log('btnGo3눌렀다', noAge)
    }

    
    function btnGoBox() {

        boxToggle = !boxToggle

        setBox(boxToggle ?'box_y':'box_r')
        console.log('btnGobox눌렀다', box)
    }



    return <>
        <h1>화면갱신</h1>
        <div>내용 : {pname}, {age}, {marriage + ''},{noAge}</div>
        <div className={box}>no1 : {no1},no2: {no2},no3:{no3},boxToggle :{boxToggle+''}</div>
        {/* 화면 갱신이 발생하지 않는다 */}

        {/* 이벤트 넣기 */}
        <button onClick={btnGo1}>버튼 1</button>
        <button onClick={btnGo3}>버튼 3</button>
        <button onClick={btnGoNoAge}>버튼noAge</button>
        <button onClick={btnGoBox}>버튼box</button>
    </>
}

export default Ootd