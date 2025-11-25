//react에서 useEffect, useState를 가지고 온다
import React, { useEffect, useState } from 'react';

//css 컴포넌트를 가져오기
import './UseEffectWatch.css'

// 함수형 컴포넌트 선언
function UseEffectCleanup(props) {

    //state를 만든다
    // 시, 분 , 초
    const [sec, setSec] = useState(0)
    const [mm, setMM] = useState(0)
    const [hh, setHH] = useState(0)

    // 시,분,초 의 시계바늘 의 변화 값
    const [sn ,setSN] = useState({transform : `rotate(0deg)`})
    const [mn ,setMN] = useState({transform : `rotate(0deg)`})
    const [hn ,setHN] = useState({transform : `rotate(0deg)`})

    //현재 시간의 변화
    const [nowStr, setNowStr] = useState('')

    // tz가 변할 때 마다 변화값을 주기위한 state
    const [tz,setTz] = useState('Asia/Seoul')


    useEffect(()=>{
        console.log('UseEffectCleanup:useEffect 실행')

        // 마운트 마다 setInterval 생성 실행
        // 현재 시간을 만들기
        const timer = setInterval(()=>{ 
            const locTime = new Date()
            const localStr = locTime.toLocaleString("en-US",{timeZone:tz})
            const now = new Date(localStr)

            console.log('timer:',now)
            setSec(now.getSeconds())
            setMM(now.getMinutes())
            setHH(now.getHours())

            // 시,분,초의 setstate 값
            setSN({transform : `rotate(${now.getSeconds()*6}deg)`})
            setMN({transform : `rotate(${now.getMinutes()*6}deg)`})
            setHN({transform : `rotate(${(now.getHours()+now.getMinutes()/60)*30}deg)`})

            //현재 날짜의 변화 값
            setNowStr(`${now.getFullYear() }년 ${now.getMonth()+1 }월 ${now.getDate() }일`)
        },1000)

        //return  ==> cleanup : 컴포넌트unmount 시 실행
        //둿정리
        return ()=>{
            console.log('cleanup 실행')
            clearInterval(timer)
        }

    //마운트 되고 tz를 최초 1번만 실행하게 하기
    },[tz])


    //출력하기
    return (
        <div>
            <h1>시계 입니다</h1>
            <div>
                <div className="date">{nowStr}</div>
                <div className="time">{hh}:{mm}:{sec}</div>
                <select onChange={(e) => setTz(e.target.value)} value={tz}>
                    <option value="America/New_York">뉴욕</option>
                    <option value="Europe/London">런던</option>
                    <option value="Europe/Moscow">모스크바</option>
                    <option value="America/Los_Angeles">로스엔젤레스</option>
                    <option value="Asia/Seoul">서울</option>
                </select>
            </div>

            <section>
                <div style={hn} className="niddle"></div>
                <div style={mn} className="niddle"></div>
                <div style={sn} className="niddle"></div>
                
            </section>
        </div>
    );
}

export default UseEffectCleanup;