// useState 와 event 섞어쓰기

// useState를 불러오기
import { useState } from "react"


// 전체 함수 
function Qwer(){


    // 함수형 state를 
    //pname의 상태값, 변화값 , 초기값
    const [pname,setPname] = useState('')

    //초기값을 [] 배열로 한다
    const [hobby,setHobby] = useState([])

    
    const pnameChange = (e) => {
        //e : event , 이벤트
        //e.target : 현재 이벤트가 걸려있는 객체,<input value={pname} onChange={pnameChange}/>
        // .value : value 값
        setPname(e.target.value)

        // console로 보여주기
        console.log('pnamechange',e.target.value)
    }

    //hobbyChange 변수선언
    //화살표 함수로 표현
    const hobbyChange = (e) => {

            //e.target.value : 이벤트가 걸려있는 객체
            const vv = e.target.value

            //이벤트가 걸려있는 객체가 checked 되었을 때
            if(e.target.checked){
            
            
            // hobby의 배열을 벗어나기 위해서 [...] 스프레드 연산자를 사용한다.
            //setHobby : hobby의 변경 되는 값
            setHobby([...hobby,vv])
            // 스프레드 안쓰면   hobby -> [[11,22,33],vv], 이중배열이 되어버린다 
            // 스프레드 쓰면  ...hobby-> [11,22,33,vv]
        
            //if가 아닐 경우 실행되는 else 문
        }else{

            // filer : 특정조건을 만족하는 값만 반환받기를 원할 때 사용 하는 매서드
            // filter(()=>)
            //item : [hobby.filter(())] 의 원소 값 , 변수
            //item != vv : vv 가 아닐 경우 item을 반환한다.
            setHobby([hobby.filter((item)=> item != vv)])
    }
            //e.target.value 의 console.log 값 보여주기
            console.log('hobbychange',e.target.value)
    }
        

    // 출력값
    return<>
        <h1>이벤트 State입니다</h1>


        {/* div로 이름,취미를 출력한다 */}
        {/* pname,hobby를 가져온다 */}
        <div>
            <div>이름 : {pname}</div>
            <div>취미 : {hobby}</div>
        </div>



{/* from으로 만들어 짐 */}
        <form>
            {/* pname 와 pnameChange를 가져온다 */}
            이름 : <input value={pname} onChange={pnameChange}/>
            <br/>


            {/* 체크박스만들기 */}
             취미 : 
            <input type='checkbox' value='그림그리기' onChange={hobbyChange}/>그림그리기
            <input type='checkbox' value='운동' onChange={hobbyChange}/>운동
            <input type='checkbox' value='먹기' onChange={hobbyChange}/>먹기
        </form>
    </>

}


//내보내기
export default Qwer