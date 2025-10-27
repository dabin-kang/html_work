const express = require('express')
const router = express.Router()
const conn = require('../examDB')
const upload =require('../upload')


function dateToStr(dbDate){
    let ddd = new Date(dbDate)
    let res = `${ddd.getFullYear()}-${ddd.getMonth()+1}-${ddd.getDate()}`
    res+=` (${'일월화수목금토'[ddd.getDay()]}) ${ddd.getHours()}:${ddd.getMinutes()}`
    return res
}

// 목록
router.get('/',(req,res)=>{
       
    conn.query('select * from exam',(err,ret)=>{
        if(err){
            console.log('목록 실패 : ', err.message)
        }else{
            console.log('/ sql 성공 : ', ret)
            res.render('list.html', {mainData : ret})
        }
    })     
})


//글쓰기 폼
router.get('/insertForm',(req,res)=>{
    res.render('insertForm.html')
})

// 글쓰기 처리
router.post('/',upload.single('ff'),(req,res)=>{
    let sql = `insert into exam (hakgi, name,pid,kor,eng, mat,pw,ff,reg_date)
                values (?,?,?,?,?,?,?,?, sysdate())`
    
    let {hakgi, name,pid,kor,eng, mat,pw} = req.body
    let data = [hakgi, name,pid,kor,eng, mat,pw, req.file.filename]          
    console.log(req.file)  
    conn.query(sql,data,(err,ret)=>{
        if(err){
            console.log('글쓰기 실패 : ', err.message)
        }else{

            //auto increament로 추가 된 id : ret. insertID
            console.log('/ sql 성공 : ', ret.insertId)
            res.render('alert.html', {title : '등록성공',msg:'등록되었습니다',dst:`/detail/${ret.insertId}`})
        }
    })     
})


//상세보기
router.get('/detail/:id',(req,res)=>{
    
    console.log(req.params.id)
       
    conn.query('select * from exam where id = ?',[req.params.id],(err,ret)=>{
        if(err){
            console.log('sql 실패 : ', err.message)
        }else{
            let md = ret[0]
            console.log('result: ', ret);
            md.regDateStr = dateToStr(md.reg_date)
            res.render('detail.html', {md : md})
        }
    })     
})

//글삭제 폼
router.get('/deleteForm/:id',(req,res)=>{
    res.render('deleteForm.html',{id:req.params.id})
})




module.exports = router