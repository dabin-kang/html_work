import { Component } from "react";
import './propStud.css'
//자식 컴포넌트

class PropStud extends Component{
    render(){

        // 던진 데이터를 받아서 처리
        let{dd} = this.props
        
        
        let jum = dd.jum.join(',')
        let tot = 0
        for (const j of dd.jum){
            tot += j
        }

        return<div className='stBox'>
            <div>이름 : {dd.pname}</div>
            <div>점수 : {dd.jum}</div>
            <div>총점 : {tot}</div>
        </div>
    }
}

// PropStud로 내보내기
export default PropStud