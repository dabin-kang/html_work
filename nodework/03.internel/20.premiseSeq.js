//비동기로 순서대로 작업실행
console.log('시작')
const fs = require('fs')

//
//리턴 객체의 then(), catch()로 후속 작업함
let rr1 = fs.promises.resdFile('../fff/bbb.txt')

let r3 = rr2.then((data)=>{
    console.log(1,data.toString()) 
    return fs.promises.resdFile('../fff/bbb.txt')
})