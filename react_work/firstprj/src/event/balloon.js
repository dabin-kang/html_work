// 풍선 이미지 가져오기
import BBB1 from '../FFF/풍선01.png'
import BBB2 from '../FFF/풍선02.png'
import BBB3 from '../FFF/풍선03.png'
import BBB4 from '../FFF/풍선04.png'
import BBB5 from '../FFF/풍선05.png'
import BBB6 from '../FFF/풍선06.png'
import BBB7 from '../FFF/풍선07.png'
import BBB8 from '../FFF/풍선08.png'
import { useState } from 'react'
import './balloon.css'


// 함수 선언
function AAA(){

    //함수 state
    const [Bal1,setBal1] = useState()
    const [Bal2,setBal2] = useState()
    const [Bal3,setBal3] = useState()
    const [Bal4,setBal4] = useState()


    //1번 풍선이 onClick 되면 발생하는 event
    //setBal1을 실행한다
    let fn_1 =(e)=>{
        console.log('fn_1 실행')
        //Bal1을 {backgroundColor:'#ff0'}로 변경시켜준다
        setBal1({backgroundColor:'#ff0'})
        
    }
    /* 
    {key: value, key: value}
    */


    //이미지 출력하기
    //재 랜더링 시점
    return<>
    <h1>풍선</h1>
    {/* 풍선이미지 가져오기 */}
    {/* 버튼이미지 */}
    <img src={BBB1} onClick={fn_1}/>
    <img src={BBB2}/>
    <img src={BBB3}/>
    <img src={BBB4}/>

    {/* 변경되는 이미지 */}
    <div className='big'>
    <div style={Bal1}><img src={BBB5}/></div>
    <div ><img src={BBB6}/></div>
    <div ><img src={BBB7}/></div>
    <div ><img src={BBB8}/></div>
    </div>
    </>

}


// 내보내기
export default AAA