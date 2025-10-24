const express = require('express')
const fs = require('fs')
const nunjucks = require('nunjucks')
const path = require('path')
const app = express()


nunjucks.configure('views',{
    autoescape: true,
    express : app
})

app.get('/',(req,res)=>{
    res.render("template.html")
})

let titleArr = {
    hello: '인사말', history: '연혁', location: '오시는길'
}

//header 구성
app.use((req, res,) => {
    req.get = ({{title}}  titleArr[path.basename(req.path)])
})

app.listen(80,()=>{
    console.log("useTemp 서버 시작")
})