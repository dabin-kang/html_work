const express = require('express')
const app = express()

app.use((req, res, next) => {
    console.log(`use 실행 1 ${req.path}`)
    next()
})

app.use((req, res, next) => {
    console.log('use 실행 2')
    next()
})

app.get('/', (req, res) => {
    res.send(`
       <h1>use 홈입니다</h1>
        <a href='/asdf'>asdf</a>
        <a href='/admin?id=aaa'>admin</a>
    `)
})

app.get('/asdf', (req, res) => {
    res.send('asdf 입니다')
})

app.get('/admin', (req, res) => {
    res.send('관리자 입니다')
})

app.listen(80, () => {
    console.log("use 서버시작")
})
