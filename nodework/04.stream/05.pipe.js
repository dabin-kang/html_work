const fs = require('fs')

// 텍스트 파일 복사
let rs = fs.createReadStream('../fff/oct.txt',{highWaterMark:16})
let we  = const ws = fs.createWriteStream('../fff/iii.txt')
rs.pipe(ws)


//이미지 복사
let rs = fs.createReadStream('../fff/ttt.txt',{highWaterMark:16})
let we  = fs.createWriteStream('../fff/jjj.txt')
rs.pipe(ws)


// aaa,bbb,ccc .txt  파일을 합쳐서  qwer.txt 로 만들려고 한다.
//필요한 옵션 re.pipe(ws,{end:false})  end : false : 종료하지 않음 ---> 쓰기 종료하지 않음


let rs1 = fs.createReadStream('../fff/aaa.txt')
let rs2 = fs.createReadStream('../fff/bbb.txt')
let rs3 = fs.createReadStream('../fff/ccc.txt')
let wst = fs.createWriteStream('../qqq/qwer.txt')

rs1.pipe(wst,{end:false})  //rs1 -> wst 쓰기


//rs1 종료시 rs2를 쓰기 시작
rs1.on('end',()=>{
    rs2.pipe(wst,{end:false})  //rs2 -> 쓰기 시작
})



rs2.on('end',()=>{
    rs3.pipe(wst)  //rs3 -> 쓰기 시작, 마지막 파일이므로 {end:false} 생략 혹은 {end:true}
})


rs1.on('error',(err)=>{
    console.log('rs1 읽기 오류',err)
})
rs2.on('error',(err)=>{
    console.log('rs2 읽기 오류',err)
})
wst.on('error',(err)=>{
    console.log('wst 쓰기 오류',err)
})

// 이미지 파일은 pipe 가 안된다 ,  결합시 최종이미지가 정상적으로 보이지 않는다




const zlib = require('zlib') // 압축모듈
rs = fs.createReadStream('../fff/oct.txt',{highWaterMark:16})
let zs = zlib.createGaip() // gz으로 압축
ws = fs.createWriteStream('../fff/zxz.gz')
rs.pipe(zs).pipe(ws)  // 읽기 -> 압축 -> 쓰기





//능남, 북산 ,해남 을 결합하여 qqq/ slamdunk.txt 파일을 생성하세요
