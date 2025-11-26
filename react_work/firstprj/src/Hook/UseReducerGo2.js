import React, { useReducer } from 'react';

import rrr from './ReducerFunc'

function UseReducerGo(props) {

    // 잡았다고 바로 실행되거나 하지 않음
    // rr: 리듀서로 사용할 함수
    //{vvv:0} : 리듀서(state 로 작동)의 기본값 --> rrr의 리턴 형태를 유지해야 함
    // 초기값을 넣는 것과 같다
    // 초기값은 100 , 기본 값은 공유하는 1234
    const [aaa,fn_1] = useReducer(rrr,{vvv:100})
    return (
        <div>
            <h1>UseReducerGo2입니다</h1>

            {/* 함수를 실행하지 않으면 초기값 출력 */}
            <div>aaa.vvv : {aaa.vvv}</div>

            {/* fn_1으로 작동이 된다 */}
            <button onClick={()=>fn_1('ppp')}>증가</button>
            {/* asdf('ppp') ==> rrr() 
                acttt = 'ppp'
                stst = {vvv:0}
                실행이후 <div>qwer.vvv : {qwer.vvv}</div>의
                {qwer.vvv}값 변경 --> 리랜더링(state로 작동)
            */}
            <button onClick={()=>fn_1('mmm')}>감소</button>
            <button onClick={()=>fn_1('vvv')}>기본</button>

        </div>
    );
}

export default UseReducerGo;