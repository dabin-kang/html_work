import { Component, createRef } from "react";

// 함수형컴포넌트에서만 useEffect 사용가능 함
// 클래스형 컴포넌트에서는 라이프사이클을 이용한 useEffect를 사용
class AAA extends Component{

    // 생성자 생성
    //생성자에서 props 매개변수가 필수
    //부모가 props를 요구하기 때문(super(props))
    // 생성자 먼저 생성 된 후에 Mount를 한다.
    constructor(props){
        super(props)
        console.log('AAA 생성자 실행')
    }

    // 멤버변수로 Ref 선언
    boxRef = createRef()

    fn_1=()=>{console.log('인풋에 커서 들어옴')}


    //라이프 사이클을 위한 준비작업
    //Mount : 컴포넌트 결합 
    //생성자가 먼저 실행 된 뒤에 Mount 가 실행
    // 결합 후 동작 - 최초 1회 실행 : useEffect와 동일한 기능
    componentDidMount(){
        console.log('componentDidMount() 실행')
        this.boxRef.current.addEventListener("focus",this.fn_1)

    }


    // 컴포넌트 결합해제
    componentWillUnmount(){
        this.boxRef.current.removeEventListener("focus,this.fn_1)}")
    }


    render(){
        return<>
            <h1>클래스 Ref</h1>
            {/* boxRef를 가져온다 */}
            <input ref = {this.boxRef}/>
        </>
    }
}

export default AAA