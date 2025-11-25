import { Component } from 'react';

//자식 클래스
export class GHG extends Component{

    constructor(SSS){
        super(SSS)
        // console.log(SSS)

        // 기본 상태 값을 받아서 세팅
        this.state ={
            mn : SSS.sub.mn,
            int : SSS.sub.int,
            pname : SSS.sub.pname
        }
    }
 
    //랜더링
    render(){

        //결과출력
        return<>
            <h1>자식에서 내보내기</h1>
            <div>{this.state.pname}</div>
            <div>가격: <input onChange={(e) => {this.setState({mn: e.target.value})}} value={this.state.mn}/></div>
            <div>수량{this.state.int}</div>
            <div>합계{this.state.int*this.state.mn}</div>
        </>
    }
}


export default GHG