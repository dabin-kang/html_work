// 리액트에서  컴포넌트를 가져와서 쓴다.
import { Component } from "react";

//선언된 위치가 class밖에서 선언되어서
// 전역 변수로 취급이 된다.
let ee = 400

// 컴포넌트를 상속받아서 AAA에서 사용하겠다
class AAA extends Component{


// state (상태 값)을 초기화
//부모인 component 의 멤버변수
//부모에서의 기본 설정 state = null
// 자식 클래스에서 초기화하여 사용해야 한다
    state ={
        aa : 10,
        bb : '아기상어',
        arr : [11,22,33]
    }


//일반 매개 변수
//멤버 변수
// 상태를 나타내는 도구
cc = 200

//버튼연결 함수
//화살표 함수로 만들어져 있다
// setState를 정의한다.
// 재랜더링 되면서 setState가 랜더링안의 지역변수를 초기화 시킨다.
fn_1=()=>{
    this.setState({
        aa: this.state.aa+1,

// ...은 배열을 하나씩 가져오고 뒤에 99를 붙인다
        arr:[...this.state.arr,99]
    })
//버튼실행시 잘 들어오는지 확인
    console.log('fn_1실행')
}

//cc실행 이벤트
fn_2=()=>{
    this.cc++
    console.log('fn_2 실행', this.cc)
}


// 랜더링
    render(){

        //지역변수
        //render(){} 매서드 안에서 만 사용되는 지역변수
        // 재랜더링시 초기화 됨
        let dd = 300

        let fn_3=()=>{// 재랜더링 안함
            dd++
            console.log('fn_3 실행', dd)
        }

        // class 밖에서 선언 한 변수
        let fn_4=()=>{
            ee++
            console.log('fn_4 실행', ee)
        }

        return<>
            <h1>클래스 state입니다</h1>

            {/* state를 가져온다 */}
            <div> aa : {this.state.aa} </div>
            <div> aa : {this.state.bb} </div>
            <div> aa : {this.state.arr.join(',')} </div>
            
            {/* 일반매개 변수 */}
            {/* cc 값을 가져오기 */}
            <div> cc : {this.cc} </div>
            <div> dd : {dd} </div>
            <div> ee : {ee} </div>

            {/* 버튼 생성 */}
            <button onClick={this.fn_1}>fn_1</button>

            {/* cc를 실행하는 버튼 */}
            <button onClick={this.fn_2}>fn_2</button>
            
            {/* this를 붙이지 않는다 , 멤버변수가 아니니까 */}
            <button onClick={fn_3}>fn_3</button>
            
            
            <button onClick={fn_4}>fn_4</button>
        </>
    }

}

//AAA로 내보내기
export default AAA
