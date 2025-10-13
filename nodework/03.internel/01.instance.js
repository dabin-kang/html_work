console.log(global) // 전역객체 - 최상위 :  javascript의 window , 각 객체에서 global 을 생략하여 사용가능

// ex) console은 global. console의  global 생략
global.console.log('아기상어')
console.log(global.console === console)  //true


a= 1234 // global.a 와 a  는  같다, global가 생략되어있음  
console.log(`a:${a}`)
console.log(`global.a:${global.a}`)
console.log(`global.a===a:${global.a===a}`)//true


global.b= 45678 
console.log(`b:${b}`)
console.log(`global.b:${global.b}`)
console.log(`global.b===b:${global.b===b}`)//true


require('./sub1') // 01.instance.js 에서 import되어 global.c와d 가 전역으로 import 된 모든 파일에서 접근가능
const fn1 = require('./sub2')

console.log(fn1) // 티라노사우르스
console.log(d) //1357

//------------------------------------------------------------------------------
console.time('전제시간')
console.time('시간1') //측정되는 시간 변수 - 시작

console.timeEnd('시간1')// 측정되는 시간 - 종료후 걸린 시간 출력


console.time('시간2') //측정되는 시간 변수 - 시작
for(let i = 0 ; i <100000; i++){

}
console.timeEnd('시간2')// 측정되는 시간 - 종료후 걸린 시간 출력



//------------------------------------------------------------------------------

console.error('에러발생') //error 로그로 처리
let mems = [
    {name:'차금우',age:26,mil:{kind:'육군',month:26}},
    {name:'차은우',age:27,mil:{kind:'공군',month:27}},
    {name:'차동우',age:22,mil:{kind:'해군',month:22}},
    {name:'차황우',age:21,mil:false}
]

console.log(mems)
console.table(mems)

// 객체의 색상구별, 깊이별 출력 : 이하 단계가 있을 경우[object]로 표현
console.dir(mems,{colors:false,depth:2})
console.dir(mems,{colors:true,depth:1})
console.dir(mems,{colors:true,depth:0})


function fn_1(){
    console.log('fn_1 시작')
    fn_2()
    console.log('fn_1 끝')
}

function fn_2(){
    console.log('fn_2 시작')
    console.trace('fn_2 위치추적') // 호출된 위치를 단계별로 추적
    console.log('fn_2 끝')
}
fn_1()





console.timeEnd('전제시간')