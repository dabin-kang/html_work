const fs = require('fs')

// 스트림으로 파일읽기( 파일경로 , highWaterMark: 버퍼크기 - 기본값 64KB)
const rs = fs.createReadStream('../fff/oct.txt',{highWaterMark:16})
                                 //파일 크기    %   16                   

let cnt = 1
let arr = []

//데이터 전송
rs.on('data',(chunk)=>{
    console.log(cnt++,chunk,chunk.length,chunk.toString())
    arr.push(chunk) // 배열에 추가
})


//스트림 전송 완료
rs.on('end',()=>{
    let buf = Buffer.concat(arr)  // concat 은 문자열 붙이기 
    console.log(arr)
    console.log('완료',buf)
    console.log(buf.toString())
})


//스트림 에러발생시
rs.on('error',(err)=>{
    let buf = Buffer.concat(arr)
    console.log('에러발생',err)
})


