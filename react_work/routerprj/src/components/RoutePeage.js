import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Head from './Pheader'
import Side from './Aside'
import Footer from './Pfooter'
import Main, { Cope, Cope1, Cope2, Cope3 } from './Pmain'
import './Peage.css'
import Pmain from './Pmain';


function Home() {
    return <>
        <h1>홈 화면</h1>
    </>
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

function RoutePeage(props) {

    return <>
        <BrowserRouter>
            <section id='big'>
                <div id='hd'><Head /></div>
                    <Routes>
                        <Route path='/home' element={<Home />} />

                        {/* 부모경로를 하나 새롭게 생성 */}
                        <Route path='/' element={<Cope />}>
                            <Route path='cope1' element={<Cope1/>}/>
                            <Route path='cope2' element={<Cope2/>}/>
                            <Route path='cope3' element={<Cope3/>}/>
                        </Route>

                        <Route path='/ga' element={<Gall />} />
                        <Route path='/cms' element={<Cms />} />
                    </Routes>
                <div id='Footer'><Footer /></div>
            </section>
        </BrowserRouter>
    </>
}

export default RoutePeage;