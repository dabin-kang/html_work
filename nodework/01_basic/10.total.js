//가지고 오고 싶은 것만 가지고 오기

const {a,b,c,fn_2} = require('./08.pp')
console.log(`a : ${a}`)
console.log(`b : ${b}`)  //require 하지 않은 변수 접근 불가
console.log(`c : ${c}`)
fn_2()


var {cc,d,fn_3} = require('./09.qq')
console.log(`a : ${a}`)
console.log(`c : ${c}`)  // 중첩 된 경우 변수 이름의 규칙에 따라 변수 값 변경
console.log(`d : ${d}`)
fn_3()