import React, { useEffect, useReducer } from 'react';
import'./reduTemp.css'


function redu(state,action){
    action.fn(action.payload)
    return {theme:action.payload}
}

const reducer = (state, action) => {
    if (action === 'A') {
        return state + 1
    } else if (action === 'B') {
        return state - 1
    }
}

export function Reheader(props) {
    const [state, patchState] = useReducer(reducer, 100);

    useEffect(() => {
        console.log(state);
    }, [state]);

    const[st, dispatch] = useReducer(redu,{theme:'dark'})

    return (
        <header className={st.theme}>
            헤더입니다
            <button onClick={() => patchState('A')}>스위치</button>
            <button onClick={()=>dispatch({type:'chtheme',payload:'dark',fn:props.parSetTh})}>다크</button>
            <button onClick={()=>dispatch({type:'chtheme',payload:'yellow',fn:props.parSetTh})}>노란</button>
            <button onClick={()=>dispatch({type:'chtheme',payload:'blue',fn:props.parSetTh})}>블루</button>
        </header>
    );
}

export default Reheader;