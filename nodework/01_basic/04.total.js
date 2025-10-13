//let ff3  = require('./03.func')

//fn_1()


// 작성된 실행구문이 동작함, 모듈로 사용하는 것이 아닌 페이지 결합으로 사용됨
//require('./03.func')

let ff5 = require('./05.mm')  
let ff6 = require('./06.nn')  
// const aaa = 정우성  module.exports = aaa 를 받아와 ff5에 대입
console.log(ff5)
console.log(ff6)
console.log(require('./06.nn'))

let ff7 = require('./07.oo')  
console.log(ff7)

let ff8 = require('./08.pp') 
console.log(ff8)
console.log(ff8.a)
console.log(ff8.b)
console.log(ff8.c)
ff8.fn_2();


let ff9 = require('./09.qq') 
console.log(ff9)
console.log(ff9.a)
console.log(ff9.b)
console.log(ff9.c)
console.log(ff9.d)
ff9.fn_3()



