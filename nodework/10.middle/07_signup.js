const express = require('express')
const app = express()
const fs = require('fs')
const path = require('path')



app.use((req,res,next)=>{
    const fpath = path.join(__dirname,'views/signup.html')
    req.ttt = fs.readFileSync(fpath,'utf8')
    console.log(req.ttt)
    next()    
})



app.get('/',(req,res)=>{
    res.send(req.ttt)
})



app.post('/signup',(req,res)=>{
    console.log(req)
    res.send('/signup 페이지')
})


app.listen(80,()=>{
    console.log("회원가입 서버생성")
})