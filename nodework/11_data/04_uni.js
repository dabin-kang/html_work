/*
대학교홈페이지 만들기

onop 대학교

인문계열 국어 영어 독어  일어 중국어
경영계열 경영 세무 회계
예술계열 음악 미술 무용

각 계열 route 파일처리
*/
const express = require('express')
const path = require('path')
const app = express()

app.use('/')



app.get('/',(req,res)=>{
    res.send("onop uni")
})




app.listen(80,()=>{
    console.log("route 서버 시작")
})