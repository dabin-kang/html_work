const express = require('express')
const fs = require('fs')
const path = require('path')
const app = express()


app.use((req,res,next)=>{
    const fPath= path.join(__dirname,'views/template.html')
    req.ttt= fs.readFileSync(fPath,'utf8')
    next()
})

let titleArr = {
}



app.get('/',(req,res)=>{
    res.send(`
        <a href='/main'>로그인</a>
        <a href='/result'>시험결과</a>
        `)
})

app.get('/main',(req,res)=>{
    res.send('로그인 입니다')
})

app.get('/result',(req,res)=>{
    res.send('시험결과 입니다')
})


app.listen(80,()=>{
    console.log("로그인 서버 생성")
})