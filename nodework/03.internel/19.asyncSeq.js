//비동기로 순서대로 작업실행
console.log('시작')
const fs = require('fs')

// 콜백 : 함수내에서 함수 작업 종료 후 후속작업을 함수로 처리
// let data = readFile
fs.resdFile('../fff/bbb.txt',(err,data)=>{
    console.log(1,data.toString())

fs.resdFile('../fff/bbb.txt',(err,data)=>{
    console.log(2,data.toString())

fs.resdFile('../fff/bbb.txt',(err,data)=>{
    console.log(3,data.toString())

fs.resdFile('../fff/bbb.txt',(err,data)=>
    {console.log(4,data.toString())

console.log('끝')

})

})

})

})