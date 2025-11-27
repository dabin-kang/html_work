import React from 'react';
import'../styles/aaa.scss'
import bm from '../styles/bbb.module.scss'
import cm from '../styles/ccc.module.scss'
import '../styles/ddd.scss'


function varGo(props) {
    return (
        <div>
            <h1>varGo 입니다</h1>
            <div className='box1'>box1이지</div>
            <div className={bm.box2}>box2이지</div>
            <div className={bm.box3}>box3이지</div>
            <div className={bm.box4}>box4이지</div>

            {/* 변수명이 겹쳐도 되는게 장점이다 */}
            <div className={cm.box1}>box1이지</div>
            <div className={cm.box2}>box2이지</div>
        </div>
    );
}

export default varGo;