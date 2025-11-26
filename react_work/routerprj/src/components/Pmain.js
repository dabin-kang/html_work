import React from 'react';
import { BrowserRouter, Link, Outlet, Route, Routes } from 'react-router-dom';

function Pmain({ children }) {
    return (
        <div>
            <h1>메인</h1>
            {children}
        </div>
    );
}

export function Cope() {
    return <>
        <div id='Side'>
            <div><Link to='/cope1'>회사소개</Link></div>
            <div><Link to='/cope2'>연혁</Link></div>
            <div><Link to='/cope3'>오시는길</Link></div>
        </div>
        <Outlet />
    </>
}

export function Cope1() {
    return <div id='Main'>
        <Pmain>인사말</Pmain>
    </div>
}

export function Cope2() {
    return <div id='Main'>
        <Pmain>회사소개</Pmain>
    </div>
}

export function Cope3() {
    return <div id='Main'>
        <Pmain>오시는 길</Pmain>
    </div>
}


function Gall() {
    return <>
        <h1>갤러리</h1>
        <h1>창원</h1>
        <h1>마산</h1>
        <h1>진행</h1>
    </>
}

function Cms() {
    return <>
        <h1>고객센터</h1>
        <h1>공지사항</h1>
        <h1>고객센터</h1>
    </>
}

export default Pmain;