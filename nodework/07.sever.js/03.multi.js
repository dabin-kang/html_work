// node 01.http.js
//동기식으로 열기

const http = require('http')
console.log(http)

//서버 생성
let server = http.createServer(

    (req,res)=>{
        res.writeHead(200,{'content-type':'text/html; charset=utf8'})
        res.end("여기는 강다빈 입니다") 
    }
)
//서버 실행
server.listen(80,()=>{
    console.log("서버 실행80, 대기80")
})

//서버생성2
let server2 = http.createServer
  (req,res)=>{
        res.writeHead(200,{'content-type':'text/html; charset=utf8'})
        res.end("8082여기는 강다빈 입니다") 
    }
}

