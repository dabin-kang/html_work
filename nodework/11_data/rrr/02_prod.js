const express = require('express')
const fs = require('fs')
const path = require('path')
const router = express.Router()




// url 맵핑
router.get('/',(req, res) => {
    res.send('제품메인')    
})

router.get('/tv',(req, res) => {
    res.send("테레비전")    
})

//router 외부 모듈로 설정
module.exports = router