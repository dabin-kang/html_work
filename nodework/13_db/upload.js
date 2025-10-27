const fs = require('fs')
const path = require('path')
const multer = require('multer')

//업로드 폴더
const upDir = path.join(__dirname,'fff/')

const qwer = multer({
    //저장공간
    storage: multer.diskStorage({
        destination:function(req,file,cb){ 
            cb(null,upDir) // cb(err혹은 null, 저장폴더)
        },
        filename:(req,file,cb) =>{ // 저장될 때 파일명
            
            const ext = path.extname(file.originalname)
            //Date.now(): timestamp
            cb(null, path.basename(file.originalname,  ext)+Date.now()+ext)
        }
    }),

    //파일크기 - 단일파일 : array 인경우 각 파일 크기 한
    limits:{fileSize : 5 * 1024*1024}, // byte 단위

    
})

module.exports = qwer


// 업로드 모듈로 만들기
