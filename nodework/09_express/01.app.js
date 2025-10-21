// express 모듈 설치
const express = require('express');
const path = require('path'); // ✅ path 모듈 불러오기

const app = express();

// 루트 페이지
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'views', 'index.html')); 
});

// info 페이지
app.get('/info', (req, res) => {
  res.send('/info 실행페이지 입니다.');
});

// history 페이지
app.get('/history', (req, res) => {
  res.sendFile(path.join(__dirname, 'views', 'history.html')); 
  
});

//배열로 여러 url을 route
app.get(['/notice','/fnq'], (req, res) => {
  res.send('${req.path}페이지 입니다.');
});

// 정규표현식처리
app.get(/\/qna|\/event/, (req, res) => {
  res.send('정규식${req.path}페이지 입니다.');
});


// gall 페이지
//:prod (동적url) 정규표현식
app.get('/gall/:prod', (req, res)=>{
    console.log('method',req.method)
    console.log('url',req.url)              //경로 + 쿼리  GET
    console.log('path',req.path)            //경로      /gall?season=spring&nowPage=3
    console.log('query',req.query)          //쿼리      { season: 'spring', nowPage: '3' }
    console.log('params',req.params)        //동적경로 변수 prod : 'tv'
    console.log('headers',req.headers)      //header 개체 {host:'192.168.0.78' , referer: 'http://192.168.0.78/'...}
    console.log(`get('referer')`,req.get('referer'))    //header 특정 요소 http://192.168.0.78/
    console.log('ip',req.ip)                // 요청한 클라이언트 ip : ffff:192.168.0.78
    console.log('ips',req.ips)              // proxy 설정시 IP 배열
    console.log('hostname',req.hostname)    // host 이름  
    console.log('protocol',req.protocol)    // http
    console.log('secure',req.secure)        // https 여부  false
    console.log('originalUrl',req.originalUrl)  //원본url /gall?season=spring&nowPage=3
    console.log('baseUrl',req.baseUrl)      //라우터 마운트 경로 
    console.log('route',req.route)          //매칭된 라우트 정보
    res.send('갤러리 페이지 입니다.')
})

// 서버 실행
app.listen(80, () => {
  console.log('Express 80번 포트 서버 실행 중...');
});
