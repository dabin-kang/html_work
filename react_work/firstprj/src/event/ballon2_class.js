import { Component } from "react";
import Bal1 from '../FFF/풍선01.png'
import Bal2 from '../FFF/풍선02.png'
import Bal3 from '../FFF/풍선03.png'
import Bal4 from '../FFF/풍선04.png'
import Bal5 from '../FFF/풍선05.png'
import Bal6 from '../FFF/풍선06.png'
import Bal7 from '../FFF/풍선07.png'
import Bal8 from '../FFF/풍선08.png'


class BBB extends Component{

    //생성자 생성
    constructor(props){
        super(props)
        console.log('생성자 실행')
    }

    // class 기반 state
    //key 배열
    //상태 초기 값
        state = {
        btn1 : {Bal1}
        }


    // 매서드 이벤트 연산
btn1 =(e)=>{
    this.Bal5 ({backgroundColor:'#ff0'})
}

    render(){
        return<>
            <h1>class 기반 풍선</h1>
            <div className="big">

                {/* 이벤트 트리거 */}
                <img src={Bal1} />
                <img src={Bal2} />
                <img src={Bal3} />
                <img src={Bal4} />

                <div>
                <img src={Bal5}/>
                <img src={Bal6} />
                <img src={Bal7} />
                <img src={Bal8} />
                </div>
            </div>
            
        </>
    }

}

export default BBB