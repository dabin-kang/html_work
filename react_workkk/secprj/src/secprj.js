import React, { Component } from "react";

class App extends Component{
    render(){
        let name = "정우성"
        let age = "43"
        let mary = true // true, false, null,undefined 는 직접 출력 불가능 
        return(
            <>
            <div>
                <div>이름{name}</div>
                <div>나이{age}</div>
                <div>결혼{mary +''}</div>
                <div>결혼{mary.toString()}</div>
                <div>결혼{`${mary}`}</div>
                <div>결혼{JSON.stringify(mary)}</div>
                
            </div>
            </>
        )
    }
}



export default App