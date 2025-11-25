import { useEffect, useState } from 'react'
import NNN from './prop/updateGo2'
import './prop/updateGo2.css'

let btnGo1 = true

//함수생성
//함수형 컴포넌트
function Bcc() {

    //변수대입 및 화면갱신
    //변경 된 State에 따라서 스타일을 다르게 준다.
    //     상태,상태를 업데이트, 초기값
    const [box, setBox] = useState(1)


    //화면 갱신후 이벤트 실행 함수
    // 버튼을 누르면 들어와서 실행
    //setBox를 이용해서 box State를 변경시킨다.
    function btn1() {
        setBox(box === 1 ? 2 : 1);
    }

    //사각형 출력
    return <>
        <h1>사각형</h1>
        <div className={box === 1 ? 'no1' : 'no2'}></div>

        {/* 버튼생성 / 클릭이벤트 */}
        <button onClick={btn1}>사각형 버튼</button>
    </>
}


export default Bcc