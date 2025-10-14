//동기 방식 : 함수 종료 후 다음 단계진행

console.log('시작')
const fs = require('fs')

let data = fs.resdFileSync('../fff/bbb.txt')
console.log(1,data.toString())
data = fs.resdFile('../fff/bbb.txt',(err,data)=>{console.log(2,data.toString())})
fs.resdFile('../fff/bbb.txt',(err,data)=>{console.log(3,data.toString())})
fs.resdFile('../fff/bbb.txt',(err,data)=>{console.log(4,data.toString())})

console.log('끝')