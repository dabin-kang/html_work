import React, { useState} from 'react';
import './ptema.css'

function Ptema(props) {

    const [theme, setTheme] = useState('yellow')

    return <>
        <section className={theme}>
            <div id='hd'> 헤더</div>
            <div id='si'>  사이드</div>
            <div id='ma'>  메인</div>
            <div id='fo'>  푸터</div>
        </section>

        <h1>테마 색상 변경</h1>
        <div id='big'>
            <select onChange={(e) => setTheme(e.target.value)} value={theme}> 색상 테마
                <option value="yellow" >노랑</option>
                <option value="red">빨강</option>
                <option value="blue">파랑</option>
            </select>
        </div>
    </>
}

export default Ptema;