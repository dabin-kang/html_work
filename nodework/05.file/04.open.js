const fs = require('fs').promises


// 파일 만들기
fs.open('../fff/jjj.txt','w')         //'w' 쓰기 모드
.then((fh)=>{
   return fh.write('파일내용 작성')    // 파일쓰기
        .then(()=>{
        fh.close                    // 파일닫기
    })
})
.then(()=>{
    console.log('파일쓰기 성공')
})
 .catch((err)=>{
    console.log('에러',err)
})


// 내용 추가하기
fs.open('../fff/jjj.txt','a')          //'a' 추가하기
.then((fh)=>{
   return fh.write('\n 추가 내용 작성') // 추가내용 작성하기
        .then(()=>{
        fh.close                      // 파일닫기
    })
})
.then(()=>{
    console.log('파일내용추가 성공')
})
 .catch((err)=>{
    console.log('에러',err)
})




fs.open('../fff/jjj.txt','r')          //'r' 읽기
.then((fh)=>{

    let buf = Buffer.alloc(1024) // 버퍼 생성

    // 파일에서 데이터를 읽어와 buf에 저장
    // 해당버퍼, 버퍼의 시작위치, 읽을수 있는 최대바이트 수,  파일에서 읽기시작할 위치
   return fh.resd(buf,0,buf,length,0) 
        .then((date)=>{ // 실제 읽은 바이트 수
            console.log('date.byteRead :',date.byteRead)
            console.log('date.buffer :',date.buffer)
            console.log('내용 :',buf.toString('utf-8,0,data.bytesRead'))
        fh.close                      
    })
})
.then(()=>{
    console.log('파일읽기 성공')
})
 .catch((err)=>{
    console.log('에러',err)
})






//node 04.open.js