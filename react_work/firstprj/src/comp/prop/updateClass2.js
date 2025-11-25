import { Component } from "react";

// css를 불러오기
import './updateGo2.css'

class BBB extends Component{

    //멤버변수(class안에서는 멤버변수, 매서드로 명칭)
    state ={
        btn1 : "no1"
    }

    //매서드
    fn_1=()=>{
        this.setState({
            // 상태를 변환시키는 토글
            btn1 : this.state.btn1 === 'no1' ? 'no2':'no1'
            
        })
    }

    render(){
        return<>
            <h1>class형 state입니다</h1>

            {/* state 값을 가져오기 */}
            <div className={this.state.btn1}>

            <div> 이름 : {this.state.name}</div>
            <div> 나이 : {this.state.age}</div>
            </div>

            {/* 버튼을 생성 */}
           <button onClick={this.fn_1}>변형시키는 버튼</button>
        </>
    }

}


export default BBB


