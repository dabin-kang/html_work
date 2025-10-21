/* 문제

    06_server.js 를 이용하여
    port : 8080 으로 서버를 실행하세요

    메인페이지
    url : aaa , bbb  두개로 진입
    aaa : 3 개의 이미지 보이게 할 것
    bbb : param에서 2개의 수를 받아 더하여 html 페이지에 출력

*/



/* 내용
1. 필요한 모듈 불러오기
    -http 모듈
    -fs
    -path
    -url

2. 서버 생성 .실행해 보기
    - http.createServer((req,res)=>{ ... })
    .listen(8080,()=>{
        console.log("서버실행")
        })

3. 요청정보 출력

4.url 객체 확인하고 가져오기



3. 파일별 응답처리(aaa,bbb 파일 열기)
    -aaa 이미지 처리
        if
    -bbb 연산합 처리
        else if
    -그 외 페이지 처리
        else


에러 발생시 처리부분 try , catch

*/


const http = require('http')    //http 모듈
const fs = require('fs')        // 파일 읽기
const path = require('path')   // 경로 확인
const { URL } = require('url')    //url객체 만 가져오기


// 서버 생성
http.createServer((req, res) => {

    //요청정보 출력
    if (req.url != 'favicon.ico') {
        console.log('method:', req.method)
        console.log('url:', req.url)
        console.log('httpVersion : ', req.httpVersion)
        console.log('headers : ', req.headers)
    }

    //url객체 가져오기
    //req.headers.host 정확한 주소를 모르고 상대 주소를 가져오기 때문에 사용
    const myUrl = new URL(req.url, `http://${req.headers.host}`)
    console.log('searchParams : ', myUrl.searchParams)


    // 서버 정상 실행시  응답
    //res.writeHead(200,{'content-type':'text/html; charset=utf-8'})
    //res.end("서버 정상 실행")


    if (req.url === '/aaa') {
        const file = fs.readFileSync(`./fff/aa1.jpg`)
        res.writeHead(200, { 'content-type':'image/jpg; charset=utf-8' })
        res.end(file)
    }else if(req.url === '/'){
        res.writeHead(200, { 'content-type': 'text/html; charset=utf-8' })
        res.end("기본페이지")
    }else if(myUrl.pathname === '/bbb'){
        res.writeHead(200, { 'content-type': 'text/html; charset=utf-8' })
        res.end("bbb페이지")
    }



}).listen(8080, () => {
    console.log("서버실행 8080 ")
})