const express = require('express')
const morgan = require('morgan')
const fs = require('fs')
const path = require('path')
const app = express()


//morgan 미들웨어 설정
// 클라이언트의 로그기록을 남긴다
let type = 'combined' //표준
type = 'combined'

type = 'common'

type ='dev'

type ='short' // 간단한 로그


const fPath = path.join(__dirname,'my.log')
const myStream = fs.createWriteStream(fPath,{flags:'a'})

//파일에 로그 작성
app.use(morgan(type,{stream:myStream}))

app.get('/',(req,res)=>{
    res.send(`<h1>morgan 서버</h1>`)
})

app.get('/qwer',(req,res)=>{
    res.send(`<h1>morgan qwer</h1>`)
})
app.listen(80,()=>{
    console.log("morgan 서버시작")
})
