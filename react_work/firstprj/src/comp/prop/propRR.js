import { Component } from "react";
import '../prop/propRR.css'

class propRR extends Component{
    render(){
        let {dd} = this.props
        let ww = dd.ww
        let hh = dd.hh
        let Ar = dd.ww*dd.hh
        let Cir = (dd.ww + dd.hh)*2


        return<div>
        <section className='RRbox'>
        <div>이름 : {dd.rr1}</div>
        <div>가로 : {dd.ww}</div>
        <div>세로 : {dd.hh}</div>
        <div>넓이 : {Ar}</div>
        <div>둘레 : {Cir}</div>
        </section >
        </div>
        

    }
    
}

export default propRR