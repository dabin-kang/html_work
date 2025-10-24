const express = require('express')
const fs = require('fs')
const nunjucks = require('nunjucks')
const app = express()

nunjucks.configure('views',{ // views 폴더 이하 위치
    autoescape: true,          // html 이스케이프 자동처리
    express : app              // express 요소 중 변수 app 에 설정
})
    


app.get('/',(req,res)=>{        // 정적인 경우 html 가능
    res.render("home.html")     // 동적 처리를 위해서는 njk필요
})

app.get('/01_basic',(req,res)=>{
    res.render("01_basic.html")
}) 

let ddd = {
    pname : '차은우',
    arr : [11,22,33],
    age : 27,
    mem : {pid : 'aaa',tel : '1111'}
}

app.get('/02_data',(req,res)=>{
    res.render("02_data.html", ddd)
}) 


app.get('/03_include',(req,res)=>{
    res.render("03_include.html", ddd)
}) 

app.get('/04_block',(req,res)=>{
    res.render("04_block.html", ddd)
}) 

app.listen(80,()=>{
    console.log("nunjucks 서버 시작")
})

// 자동실행 명령어 nodemon --config .nodemon.json