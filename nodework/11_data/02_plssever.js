/*
더하기 서버를 구현하세요
서버 : 두개의 수를 post 로 받음
클라이언트 : input으로 두개의 수를 입력받아 fetch로 서버에게 비동기 통신 후
결과 내용을 json 형태로 받아 출력 
*/


const express = require('express')
const fs = require('fs')
const path = require('path')
const app = express()



    
  


app.get('/',(req,res)=>{
    const fpath = path.join(__dirname,'views/plssever.html')
    fs.readFile(fpath,'utf8',(err,data)=>{
        if(err){
            return res.status(500).send("파일오류")
        }
        res.send(data)
    })
})


app.listen(80,()=>{
    console.log("서버시작")
})
