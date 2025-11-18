import { Component } from "react";

let aa = 0

console.log(`asdf 입니다1 ${aa}`)


class BBB extends Component{

    bb = 0

    constructor(){
        super()
        aa++
        this.bb++
        console.log(`BBB 생성자 실행 ${aa}, ${this.bb}`)
    }

    render(){//렌더를 재정의
        let cc = 0
        aa++
        this.bb++
        cc++
        console.log(`렌더입니다2 ${aa},${this.bb},${cc}`)
        return<div>BBB{aa}{this.bb}{cc}</div>
    }

}

export default BBB // 클래스 기반 Coponemt:Coponemt클래스를 상속해야함