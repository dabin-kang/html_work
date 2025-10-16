/*
id      pw      이름
aaa     1111    장동건
bbb     2222    장서건
ccc     3333    장남건

로그인 성공시
"장동건 님  안녕하세요" 메세지 출력하기
*/
/*

*/

const readline = require('readline') // node.js의 기본 내장 모듈 **reajline**를 불러오기

const rr = readline.createInterface({
    input: process.studin,
    output: process.stdout
})

rr.question



let plogin = [
    {pname : '장동건', pid: 'aaa',pw:1111},
    {pname : '장서건', pid: 'bbb',pw:2222},
    {pname : '장남건', pid: 'ccc',pw:3333}
]
console.log(plogin)

