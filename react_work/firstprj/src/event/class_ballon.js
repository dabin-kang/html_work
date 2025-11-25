//Component, createRef 를 가져오기
import { Component, createRef } from "react";
import './eventBalloon.css'




class AAA extends Component{
    constructor(props){
        super(props)


        //이미지를 담을 빈 배열을 생성
        this.balloons = []
        

        //이미지를 하나씩 불러와서 .balloons에 담아 배열로 만들기
        //this.balloons.push 로 추가한다.
        //(`../fff/풍선/0${i}.png`))
        //(풍선0{1},풍선0{2},풍선0{3}....풍선0{8}까지)
        for (let i = 1; i <=8; i++) {
            this.balloons.push(require(`../fff/풍선/0${i}.png`))
        }
    }

    

    //class형 컴포넌트 state 만들기
    state={
        bb4:null,
        bb5:null,
        bb6:null,
        bb7:null
    }

    // Ref 만들기
    ballRef4 = createRef()
    ballRef5 = createRef()
    ballRef6 = createRef()
    ballRef7 = createRef()


    //이벤트에 따라를 상태 변경
    fn_4=()=>{
        console.log("fn_4 입니다")
        this.setState({
            bb4:{backgroundColor:'#ff0'}
        })
    }
    fn_5=()=>{
        console.log("fn_5 입니다")
        this.setState({
            bb5:{boxShadow:"10px 10px 20px #000"}
        })
    }
    fn_6=()=>{
        console.log("fn_6 입니다")
        this.setState({
            bb6:{opacity:0.3}
        })
    }
    fn_7=()=>{
        console.log("fn_7 입니다")
        this.setState({
            bb7:{transform:"rotate(90deg)"}
        })
    }

    //lifecycle : componentDidMount(){}
    //이벤트를 실행
    componentDidMount(){
        this.ballRef4.current.addEventListener('mousedown',this.fn_4)
        this.ballRef5.current.addEventListener('mouseover',this.fn_5)
        this.ballRef6.current.addEventListener('mouseleave',this.fn_6)
        this.ballRef7.current.addEventListener('mouseup',this.fn_7)
    }

    //lifecycle : componentWillUnmount(){}
    //컴포넌트를 Dom에서 제거
    //언마운트
    componentWillUnmount(){
        this.ballRef4.current.removeEventListener('mousedown',this.fn_4)
        this.ballRef5.current.removeEventListener('mouseover',this.fn_5)
        this.ballRef6.current.removeEventListener('mouseleave',this.fn_6)
        this.ballRef7.current.removeEventListener('mouseup',this.fn_7)
    }


    //랜더링
    render(){
        return <>
        <h1>이벤트풍선입니다.</h1>
       
        {/* 이미지를 가져오기           Ref를 가져오기*/}
         <img src={this.balloons[0]} ref={this.ballRef4} />
         <img src={this.balloons[1]} ref={this.ballRef5} />
         <img src={this.balloons[2]} ref={this.ballRef6} />
         <img src={this.balloons[3]} ref={this.ballRef7} />
         
         {/* 변경되는 이미지들  */}
         {/* 스타일 적용 */}
         <div className="big">
            <div style={this.state.bb4}><img src={this.balloons[4]}/></div>
            <div style={this.state.bb5}><img src={this.balloons[5]}/></div>
            <div style={this.state.bb6}><img src={this.balloons[6]}/></div>
            <div style={this.state.bb7}><img src={this.balloons[7]}/></div>
         </div>  
    </>
    }
}

export default AAA