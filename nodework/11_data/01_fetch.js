const express = require('express')
const fs = require('fs')
const path = require('path')
const multer = require('multer')
const app = express()

const qwer = multer()


//post처리
app.use(express.urlencoded({extended:true}))

//json 처리
//app.use(express.json());

app.get('/',(req, res) => {
    res.sendFile(path.join(__dirname,"views/fetchhome.html"))
})

app.get('/test1',(req, res) => {
    res.send('fetch서버응답 test1')
})

app.get('/test2',(req, res) => {
    console.log('test2',req.query)
    res.send('get test2')
})

//postdata 수신 : app.use(express.json()) + app.use(express.urlencoded({extended:true}))
app.post('/test3',(req, res) => {
    console.log('test3',req.body)
    res.send('post test3')
})

//formdata 수신 :multer + app.use(express.urlencoded({extended:true}))
app.post('/test4',qwer.none(),(req, res) => {
    console.log('test4',req.body)
    res.send('post test4')
})

app.post('/test5',qwer.none(),(req, res) => {
    console.log('test5')
    let data = [
        {pid:'aaa',age:45, mil:true},
        {pid:'bbb',age:37, mil:false},
        {pid:'ccc',age:29, mil:true},
        {pid:'ddd',age:16, mil:true},
    ]
    res.json(data) // json 형태의 문자열로 내보내기
})

app.listen(80, () => {
    console.log("fetch 서버 시작")
})