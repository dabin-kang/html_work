const express = require('express')
const path = require('path')
const fs = require('fs')
const app = express() // 모듈 불러오기

app.use(express.urlencoded({ extended: true })) // 미들웨어 설정

let me = null

// 메인 페이지 라우팅
app.get('/', (req, res) => {
    if (me) {
        res.send(`
            <h1>${me}님 로그인 성공!</h1>
            <a href="/logout">로그아웃</a>
        `)
    } else {
        res.sendFile(path.join(__dirname, 'views', 'logMain.html'))
    }
})

// 로그인 요청 처리
app.post('/', (req, res) => {
    const { pid, pw } = req.body
    console.log(pid, pw)

    let msg = '로그인 실패'
    if (pid === 'aaa' && pw === '1111') {
        msg = '로그인 성공'
        me = pid
    }

    res.send(`
        <script>
            alert('${msg}');
            location.href='/'; 
        </script>
    `)
})

// 로그아웃 처리
app.get('/logout', (req, res) => {
    me = null
    res.send(`
        <script>
            alert('로그아웃 되었습니다');
            location.href='/';
        </script>
    `)
})

app.listen(80, () => {
    console.log('login 서버 실행')
})
