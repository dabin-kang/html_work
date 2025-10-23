const express = require('express')
const fs = require('fs')
const path = require('path')
const router = express.Router()



// url 맵핑
router.get('/',(req, res) => {
    res.sendFile(path.join(__dirname,'../views/routeMain.html'))    
})

router.get('/hello',(req, res) => {
    res.send("점심이야")    
})

//router 외부 모듈로 설정
module.exports = router