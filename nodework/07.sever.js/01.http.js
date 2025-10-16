// node 01.http.js
//동기식으로 열기

const http = require('http')
console.log(http)

//서버 생성
let server = http.createServer(
    //콜백함수 : 생성시 서버에 접근하였을때의 이벤트 처리
    //req : 요청 객체
    //res : 응답 객체

    (req,res)=>{
        //접속하는 클라이언트에게 전달
        //정상처리 : 200
        res.writeHead(200,{'content-type':'text/html; charset=utf8'})
        res.end("여기는 강다빈 입니다") 
    }
)

//서버 실행
server.listen(80,()=>{
    console.log("서버 실행5000 , 대기5000")
})

