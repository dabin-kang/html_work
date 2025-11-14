import React, { Component } from "react";

class App extends Component{
    
    render(){
        let no = 5

        return(
            <>
            {/*jsx (javascript xml)문법 
                javascript에서 html을 사용
                render시 컴파일 하여 적용 : babel 이 jsx를 javascript로 변환

                render 시 1개의 엘리멘트 형태로 리턴
                엘리먼트는 닫혀 있어야 함
            */}
            <h1>내가 니 App이야1</h1>
            <h1>내가 니 App이야{no}</h1>
            <input type='text' name='pid'value={no+25}/>
            </>
        )
    }
}


export default App;



/*
react_workkk 폴더 안에 secprj 리액트프로젝트를 생성하세요
포트번호 8888
출력내용

이름 정우성
나이 43
결혼 true

정우성, 43, true 는 변수로 처리 하세요

*/