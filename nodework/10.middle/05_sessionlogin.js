const express = require('express')
const session = require('express-session')
const cookie = require('cookie-parser')
const fs = require('fs')
const path = require('path')
const cookieParser = require('cookie-parser')
const app = express()


app.use(express.static(path.join(__dirname)));

// cookieParser
app.use(cookieParser())

// session setting
app.use(
    session({
        secret:'asdf1234!@#$',
        resave:false,
        saveUninitialized:true,
        cookie:{secure:false}
    })
)

app.get('/',(req,res)=>{
    res.send(`/ 페이지입니다`)
});

app.post('/bbb', (req, res) => {
    console.log(req);
    res.send('/bbb 요청보냄')
});

app.listen(80,()=>{
    console.log("로그인 서버생성")
})