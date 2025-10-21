const express = require('express')
const app = express()

// 프록시 ,관리자가 아니면 차단하기
app.use((req, res, next) => {
    console.log(`use 실행 1 ${req.path},${req.query.id}`)
    if (req.path == '/admin' && req.query.id != 'aaa') {
        res.send(`
            <script>
            alert('잘못된 접근입니다')
            location.href='/'
            </script>
            `)
    } else
        next()
})

//공통데이터 처리 - 이하 구문에서 req를 이용하여 데이터 전달
app.use((req, res, next) => {
    console.log('use 실행 2')
    req.myMsg = 'use2메세지'
    next()
})

app.get('/', (req, res) => {
    res.send(`
       <h1>use 홈입니다 ${req.myMsg}</h1>
        <a href='/asdf'>asdf</a>
        <a href='/admin?id=aaa'>admin</a>
        <a href='/cwewewe'>없는페이지</a>
        <a href='/qwer'>에러발생페이지</a>
    `)
})


app.get('/asdf', (req, res, next) => {
    next()
})

app.get('/asdf', (req, res) => {
    res.send(`asdf ${req.myMsg}`) // 최종 처리에서 send 
})

app.get('/admin', (req, res) => {
    res.send(`관리자 입니다${req.myMsg}`)
})

//에러발생페이지
app.get('/qwer', (req, res) => {
    const err = new Error('테스트용 에러발생')
    throw err; // 에러발생  
})

//에러 처리
app.use((err, req, res, next) => {
    if (err instanceof Error) {
        return res.status(404).send(`404 에러: ${err.message}`)
    }

    res.status(500).send(`500 : 서버 에러`)
})

//404 에러 처리
app.use((req, res, next) => {
    res.status(404).send(`404 : 요청한 페이지를 찾을수 없다`)
})

app.listen(80, () => {
    console.log("use 서버시작")
})



/*
use
proxy
데이터 전달
에러처리(500,404)

next
route, use  다음함수로 진입
메세지 전달  req에 key, value 추가

*/