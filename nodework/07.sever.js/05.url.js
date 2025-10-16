const http = require('http')
const fs = require('fs')
const path = require('path')
const {url} = require('url')


((req,res)=>{

try{

    let service = '/index'

    if(req.url !='/favicon.ico'){
    //console.log('req',req)
    console.log('method:',req.method)
    console.log('url:',req.url)
    console.log('headers:',req.headers)
    console.log('httpVersion:',req.httpVersion)
    console.log('soket:',req.soket)
    console.log('statusCode:',req.statusCode)

    //기본서버인 경우 ; http://${req.headers.host 가 필요(기본서버는 상대  url만 제공하기 때문)
    const myurl = new URL(req.url,`http://${req.headers.host}`)
    console.log('href',myurl.href)
    console.log('origin',myurl.origin)
    console.log('protocol',myurl.protocol)
    console.log('username',myurl.username)
    console.log('password',myurl.password)
    console.log('host',myurl.host)
    console.log('hostname',myurl.hostname)
    console.log('pathname',myurl.pathname)
    console.log('dirname',myurl.dirname)
    console.log('searchParams',myurl.searchParams)
    console.log('hash',myurl.hash)

    if(path.basename(myurl.pathname).trim()!='/')
    service = path.basename(myUrl.pathname).trim()
    }


 

  if(service.startsWith('/fff')){ //이미지 폴더
    const data = fs.readFileSync('${service}')
    res.writeHead(200,{'content-type':'image/jpeg'})
    res.end(data)

    else if(service=='/now')

  }else{
    const data = fs.readFileSync('./views/${service}.html')
    res.writeHead(200,{'content-type':'text/html; charset=utf8'})
    res.end(data)
  }
    
     

}catch(error){
    res.writeHead(200,{'content-type':'text/html; charset=utf8'})
    res.end("빠른 시일내에 복구하겠습니다") 

}
})
        server.listen(80,()=>{
            console.log("서버실행중")
        })



        /*
        06.server.js 를 이용하여
        port : 8080 으로 서버를 실행하세요

        메인페이지
        url : aaa , bbb 두개로 진입
        aaa : 3개의 이미지가 보이게 할 것
        bbb : parnm에서 2개으 수를 받아 연산하여 html페이지에 출력

        */