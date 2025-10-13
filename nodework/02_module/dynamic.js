var{v1,v2} = require('./ddd')
var{aa,bb} = require('./sub3')

if(v1){   // 변수로 import 실행 유무 설정
    var {aa,bb} = require('./sub4')
}

console.log(aa,bb)

var tt ='./sub${v2}'
var{cc,dd} = require(tt) // 변수로 import 파일 설정 가능
console.log(cc,dd)

