const express = require('express')
const fs = require('fs')
const path = require('path')
const multer = require('multer')
const app = express()


//01_info 모듈 가져오기
const infoRT = require('./rrr/01_info')
const prodRT = require('./rrr/02_prod')

// 모듈을 이용한 route
app.use('/',infoRT)
app.use('/prod',prodRT)
    





app.listen(80, () => {
    console.log("fetch 서버 시작")
})