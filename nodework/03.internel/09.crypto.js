const crypto = require('crypto')

console.log('[단방향]')

//64 : 64byte크기로 만든다.
//(e,b) =>() ; 콜백함수 e(err) = 에러 발생시 에러객체
//                     b(buf) =  정상작업 객체  
/*
crypto.randomBytes(64,(e,b)=>{
    let ttt = b.toString('base64') // 암호화 알고리즘 : base64 를 사용하겠다
    console.log(`salt : ${ttt}`)    // salt : 암호키


    //salt  : ttt 를 이용하여 평서문 => 암호화 시키는 게 목적
    //crypto.pbkdf2(평서문,salt,반복횟수,출력바이트,암호화기법,콜백함수)
    let aa = '1234'
    crypto.pbkdf2('1234',ttt,10000,64,'sha512',(ee,kk)=>{
        console.log(`평문 : ${aa}, 암호화 : ${kk.toString('base64')}`) // 다시 1234로 되돌릴 수 없다
    })
})
*/
let ttt = crypto.randomBytes(64).toString('base64')
console.log(`salt : ${ttt}`)
let aa = '1234'
let kk = crypto.pbkdf2Sync(aa,ttt,10000,64,'sha512')
console.log(`평문 : ${aa},암호화:${kk.toString('base64')}`)


console.log('[양방향]')

const algorithm = 'aes-256-cbc'                      // 알고리즘
const key = 'abcdefghijklmnopqrstuvwxyz123456'      // key 32byte
const iv = '1234567901234567'                        // 초기값 벡터16byte 는 맞춰줘야한다

//암호화 함수 생성

const cip = crypto.createCipheriv(algorithm,key,iv)
aa = 'onop' // 평서문
let rr = cip.update(aa,'utf8','base64')
console.log(`암호문 : ${rr}`)  //정상출력 못함
rr += cip.final('base64')
console.log(`암호문 : ${rr}`)

//복호화 객체 생성
const decip = crypto.createDecipheriv(algorithm,key,iv)
let rr2 = decip.update(rr,'base64','utf8')
console.log(`복호문1 : ${rr2}`)  
rr2 += decip.final('utf8')
console.log(`복호문 : ${rr2}`)