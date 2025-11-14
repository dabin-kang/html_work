/*
exam.js 를 생성하고
이름, 국어,영어,수학, 총점,평균,등급을 출력하세요.*/

import React from "react";
import './exam.css'
function Exam() {
    let jum = 80
    let name = '강다빈'
    let kor = 70
    let math = 60
    let eng = 90
    let sum = kor + math + eng
    let average = sum / 3; // 80

    const students = [
        { name: '강다빈', kor: 70, eng: 90, math: 60 },
        { name: '김철수', kor: 85, eng: 75, math: 90 },
        { name: '이영희', kor: 95, eng: 88, math: 92 },
        { name: '박민수', kor: 60, eng: 70, math: 65 }
    ] // 데이터베이스에서 가져온 데이터인 경우

    const ranks = [
        { grade: '수', min: 90 },
        { grade: '우', min: 80 },
        { grade: '미', min: 70 },
        { grade: '양', min: 60 },
        { grade: '가', min: 0 },
    ];

    for (const rank of ranks) {
        console.log(rank);
    }

    ranks.forEach((v, i) => console.log(v));

    return (
        <>
            <div className="vvas">이름 : {name}</div>
            <div>국어 : {kor}점</div>
            <div>영어 : {math}점</div>
            <div>수학 : {eng}점</div>
            <div>총점 : {sum}점</div>
            <div>평균 : {average}</div>
            <div>등급 : </div>
            {students.map((v, i) => {
                return (
                    <div>
                        <span>{v.name}: </span>
                        <span>{v.kor}</span>
                        <div></div>
                    </div>
                );
            })}
        </>
    )
}

export default Exam