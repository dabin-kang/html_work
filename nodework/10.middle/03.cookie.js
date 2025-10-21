const express = require('express')
const cookieParser = require('cookie-parser')
const mod01 = require('./coo/01.mod.js')
const app = express()

app.use(cookieParser())


let me = null
//document.cookie
app.get('/',(req,res)=>{
    res.send(`cookie 실행
    <a href ='/m1'>m1</a>
    <a href ='/make'>쿠키생성</a>
    <a href ='/view'>view</a>
    <a href ='/modify'>modify</a>
    <a href ='/delete'>delete</a>
    `)
})

app.get('/m1',mod01.fn_1)
app.get('/make',(req,res)=>{
    res.cookie('pid','aaa')    
    res.cookie('pname','원빈')
    res.send('쿠키 생성')    
})

app.get('/view',mod01.view)
app.get('/modify')
app.get('/deldte',(req,res)=>{
    res.clearCookie('pname')
    res.send('쿠키삭제')
})


app.listen(80,()=>{
    console.log("cookie 서버시작")
})