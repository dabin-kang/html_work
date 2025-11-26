import React, { Children, createContext, useContext, useState } from 'react';

//1. Context 생성
// createContext() 를 선언해야 한다.
const MyContext = createContext()

//2.Provider 컴포넌트 정의
const MyProvider = ({ children }) => {
    // return<div>
    // MyProvider 입니다
    // </div>
    // = props.Children

    const [state, setState] = useState('yellow');

    //3. context.provider. 을 이용한 date 제공: value={{pname:'정우성',age:45,marriage:true}}
    //context 의 Provider은 value기 필수
    // return <MyContext.Provider value={{pname:'정우성',age:age,setAge:setAge,marriage:true}}></MyContext.Provider>
    // state를 value로 보냄 : age,setAge
    return (
        <MyContext.Provider value={{ state, setState }}>
            {children} {/*  */}
        </MyContext.Provider>
    );
}

const Button = () => {
    const { state, setState } = useContext(MyContext);

    return (
        <button
            style={{ backgroundColor: state }}
            onClick={() => setState('red')}
        >
            색상 변경
        </button>
    );
}

function ContextGo() { // 페이지 렌더링
    return (
        <div>
            <h1>ContextGo GO</h1>
            <div>렌더링용 페이지</div>
            {/* <MyProvider>
                왔다리
            </MyProvider> */}
            <MyProvider>
                <Button />
            </MyProvider>
            {/*<SubCom1/> context의 제공영역 안에서만 사용가능 */}
        </div>
    );
}

export default ContextGo;



/*
화면구성을 하기

헤더
사이드
메인
푸터

색상 테마 3개를 설정하여 변경
헤더,사이드,푸터 변경
메인은 변경되지 않는다.
*/