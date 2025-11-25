
import { Component, useEffect } from "react";
export const PropStud = ({ dd, state }) => {
    let total = dd.jum.reduce((acc, val) => acc + val, 0);

    console.log(state);

    return (
        <div className='stBox'>
            <div>이름 : {dd.pname}</div>
            <div>점수 : {dd.jum.join(' | ')}</div>
            <div>총점 : {total}</div>
        </div>
    )
}