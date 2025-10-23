const express = require('express')
const fs = require('fs')
const path = require('path')
const multer = require('multer')
const app = express()

app.use(express.urlencoded({extended:true}))

app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'views/mulForm.html'))
})


/*
enctype="multipart/form-data"로 전송시 처리 못함 : 에러 발생
app.post('/single',(req,res)=>{
    console.log("/single----------------------")
    console.log('pname: ${req.body.pname}')
    res.send('single 파일처리')
})
*/

//enctype="multipart/form-data"로 전송시 파일 처리
const qwer = multer({
    //저장공간
    storage: multer.diskStorage({
        //req : 요청정보
        //file ; 업로드 된 파일
        //cb ; 콜백함수 - 실행
        //dst/ 업로드 파일명
        destination:function(req,file,cd){ //저장위치
            cb(null,'dst') // cd(err혹은 null, 저장폴더)
        },
        fildname:(req,file,cd) =>{ // 저장될 때 파일명
            cb(null, file.originalname) // cb(err 혹은 null,파일명)
                                        //file.originalname 업로드된 파일의 이름
            const ext = path.extname(file.originalname)//확장자명
            //Date.now(): timestamp
            cb(null, path.basename(file.originalname,ext)+Date.now()+ext)
        }
    }),

    //파일크기 - 단일파일 : array 인경우 각 파일 크기 한
    limits:{fileSize : 5 * 1024*1024}, // byte 단위

    //파일필터링
    fileFilter:(req,file,cb)=>{
        const allowedTypes = ['image/hpeg','image/png']
        //file.mimetype 업로드 파일 형식
        if(allowedTypes.includes(file.mimetype)){
            //파일허용
            cb(null,true)

        }else{
            //파일거부
            cb(new Error('파일형식거부'),false)
        }
    }
})

app.use((err,req,res,next)=>{
    console.log('예외처리')
    res.status(500).send(`500:에외처리 => ${err.message}`) 
})

//multer
app.post('/single',qwer.single('ff'),(req,res) => {
    console.log("/single-------------")
    console.log(`/pname: ${req.body.pname}`) //일반필드 : req,body
    console.log(`ff:${req.body.ff}`)
    console.log(`ff:`,req.file)
    res.send('single 파일처리')
    
})

//qwer.none('ff')파일 업로드시 에러방생, 파일이 없을 경우에는 정상실행
app.post('/none',qwer.none('ff'),(req,res) => {
    console.log("/none-------------")
    console.log(`/pname: ${req.body.pname}`) //일반필드 : req,body
    console.log(`ff:${req.body.ff}`)
    console.log(`ff:`,req.file)
    res.send('none 파일처리')
    
})


//qwer.array('ff') multiple에 의한 여러 파일 업로드
app.post('/array',qwer.array('ff'),(req,res) => {
    console.log("/array-------------")
    console.log(`/pname: ${req.body.pname}`) 
    console.log(`ff:`,req.file)         //파일필드 - 단일파일
    console.log(`ff:`,req.files)        //파일필드 - 파일여러개
    res.send('array 파일처리')
})


//qwer.array('ff',3) 파일 갯수 제한 3개까지 가능 3개 초과시 에러발생
app.post('/array3',qwer.array('ff',3),(req,res) => {
    console.log("/array-------------")
    console.log(`/pname: ${req.body.pname}`) 
    console.log(`ff:`,req.file)         //파일필드 - 단일파일
    console.log(`ff:`,req.files)        //파일필드 - 파일여러개
    res.send('array 갯수제한 파일처리')
    
})

//qwer.fields(배열)
//maxcount : 파일갯수 제한
const arr = [
    {name:'ff1',maxCount:1},
    {name:'ff2'},
    {name:'ff3',maxCount:3},
    {name:'ff4'}
]

//qwer.fields
app.post('/array3',qwer.array('ff',3),(req,res) => {
    console.log("/array-------------")
    console.log(`/pname: ${req.body.pname}`) 
    console.log(`ff:`,req.file)         //파일필드 - 단일파일
    console.log(`ff:`,req.files)        //파일필드 - 파일여러개
    res.send('array 갯수제한 파일처리')
    
})


app.get('/download',(req,res)=>{
    //파일 다운로드 : res.download(파일경로)
    res.sendFile(path.join(__dirname,'qqq/octopus.txt'))
})



app.listen(80, () => {
    console.log("mylter 서버 시작")
})