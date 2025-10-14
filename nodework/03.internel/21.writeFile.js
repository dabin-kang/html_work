const fs = require('fs')

// 덮어쓰기
fs.writeFile('../fff/ccc.txt','나는 무운어',(err)=>{
    if(err){
        console.log('writeFile 에러발생')
    }else{
        console.log('writeFile 성공')
    }
})


// 내용 추가(실행 할 때 마다 중첩이 됨)
fs.appendFile('../fff/ddd.txt','나는 고래',(err)=>{
    if(err){
        console.log('appendFile 에러발생')
    }else{
        console.log('appendFile 성공')
    }
})





fs.promises.writeFile('../fff/eee.txt','나는 무운어')
fs.promises.writeFile('../fff/hhh.txt','나는 거북이')



fs.writeFileSync('../fff/ggg.txt','나는 소녀시대')
fs.appendFileSync('../fff/uyu.txt','나는 청년시대')




  