// useEffect 불러오기
// useRef 는 무언가를 참조할 때 사용
import { useEffect , useRef } from "react"

// 이미지를 불러오기
import one from'../FFF/스크린샷 2025-09-22 090906.png'


function AAC(){

    //버튼을 실행하는 내부 함수 
    function fn_1(){
        alert('fn_1 실행')
        console.log('fn_1실행')
    }

    function fn_2(){
        let ret = window.confirm('누를꺼야?')
        console.log('fn_2실행',ret)
    }


    function inputtt(e){
        console.log('inputtt 실행',e.target.value)
    }
    function changee(e){
        console.log('changee 실행',e.target.value)
    }

    let Submittt=(e)=>{
        e.preventDefault() //넘어가지 않게 막는다
        const myData = new FormDataEvent(e.target)//폼 전체데이터
        console.log('Submittt 실행1', myData.get('pid'),myData.get('pw'),myData.get('email'))

        const myJson = Object.fromEntries(myData.entries())// Json으로 변경
        console.log('Submittt 실행2', myData.get('pid'),myData.get('pw'),myData.get('email'))
    }

    function resize(){
        console.log('창 크기 변경',window.innerWidth,window.innerHeight)
    }


    function scrolll(){
        console.log('스크롤',window.scrollX,window.scrollY)
    }


const boxRef = useRef(null)  // <div> 와 같은 객체 참조용 : jsx문법으로 생성한 객체에 연결한다


// 함수형 컴포넌트에서만 useEffect 는 사용이 가능
// widow/document 이벤트는 useEffect 에서 등록
    useEffect(()=>{

            //addEventListener('eventType',function)
        window.addEventListener('resize',resize)
        window.addEventListener('resize',scrolll)

        //boxRef -> box
        const box = boxRef.current

        const boxScroll = () =>{
            console.log('box 스크롤',box.scrollX,box.scrollY)
            console.log('box 스크롤',box.scrollLeft,box.scrollTop)
        }

        box.addEventListener('scroll',boxScroll)// 스크롤

        return()=>{ // 컴포넌트 삭제시 이벤트 삭제
            window.removeEventListener('resize',resize)// 창크기 변경
            window.removeEventListener('scroll',scrolll)// 스크롤
            box.removeEventListener('scroll',scrolll)
        }
    },[])



    



    let keyDownnn=(e)=>{
        //key : 입력 된 글자
        //code; 키보드 위치
        //keyCode : 숫자코드
        console.log('keyDownnn',e.key,e.code, e.keyCode)
    }


    return<>
        <h1>이벤트 입니다.</h1>
        {/* 버튼 태그에서 클릭 이벤트 버튼 생성하기 */}
        <button onClick={fn_1}>클릭</button>
        <button onDoubleClick={fn_2}>더블클릭</button>

        {/* alert는 변수가 필요함 */}
        <button onClick={()=>alert('경고창입니다')}>경고창입니다</button>


{/* div 안에다 마우스를 전부다 넣음 */}
        <div style={{
            width:'200px',
            height:'200px',
            backgroundColor:'#ff0'
        }}
        // 마우스가 들어가면 실행 됨 ,  마우스의 좌표를 알수가 있다
        onMouseEnter={(e)=>{console.log('마우스가 들어가면 움직임',e.clientX,e.clientY)}}
        onMouseLeave={(e)=>{console.log('마우스가 ',e.clientX,e.clientY)}}
        onMouseDown={(e)=>{console.log('마우스 다운',e.clientX,e.clientY)}}
        onMouseUp={(e)=>{console.log('마우스 업',e.clientX,e.clientY)}}
        onMouseMove={(e)=>{console.log('마우스 무브',e.clientX,e.clientY)}}
        >마우스움직임</div>

        
        <input 
        onInput={inputtt} // 입력시 호출
        onChange={changee}// 변경이 될 경우 호출

        //화살표 함수로 표현하는 방식5
        onFocus={()=>{console.log('인풋에 커서 들어옴')}}
        onBlur={()=>{console.log('인풋에 커서 나감')}}// 인풋 밖에 클릭
        onKeyDown={keyDownnn}
        />

        {/* joinReg로 보내기 */}
        <form action='joinReg' onSubmit={Submittt}>
            id : <input name='pid'/><br/>
            pw : <input name='pw'/><br/>
            email : <input name='email'/><br/>
            <button type='submit'>전송</button>
        </form>


        <div style={{
            width:'2000px',
            height:'2000px',
            backgroundColor:'#ff0',
        }}>
        </div>

{/* ref={boxRef}  useRef로 생성,선언한 객체(boxRef) 연결 */}
{/* div ----> boxRef ----> box */}

        <div ref={boxRef} style={{
            width:'1200px',
            height:'500px',
            backgroundColor:'rgba(109, 109, 41, 1)',
            overflow:'auto'
        }}>
            <img src={one}/>
        </div>


    </>

}

export default AAC