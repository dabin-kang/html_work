const fs = require('fs')

//읽기
// exam.txt 파일의 데이터들을 가져오기
fs.readFile('../fff/exam.txt','utf8',(err,data)=>{
    if (err){
        console.log('파일읽기에러:',err)
        return
    }
    console.log('파일내용:', data)
    

//점수를 , 로 나누기
    const sum = sum.split(',')


})//읽기 안에 쓰기를 넣어서 읽고 난 뒤에 바로 쓰기로 넘어가게하기


