const http = require('http')
const fs = require('fs')

http.createServer((req,res)=>{

try{
    //파일을 읽어와 데이터 전송
    const data = fs.readFileSync('./home.html')
    res.writeHead(200,{'content-type':'text/html; charset=utf8'})
    res.end("여기는 강다빈 입니다") 

}catch(error){
    res.writeHead(200,{'content-type':'text/html; charset=utf8'})
    res.end("빠른 시일내에 복구하겠습니다") 

}
})
        
server.listen(80,()=>{
    console.log("80서버실행 , 대기")
})