const fs = require('fs')

console.log(10'나는 문어')

let data = fs.readFileSync('../fff/aaa.text')
console.log('data:',data.toString())

try{
fs.readFile('../fff/bbb.txt',(err,data)=>{ // 콜백함수로 에러를 처리해버린다
    if(err){
        console.log(`readFile 에러발생`)
    }else{
        console.log(`data2:`,data.toString())
    }

})
}catch(e){
    console.log('에러발생2:') // 실행되지 않는다 : 비동식의 callback 함수 처리로 실행되지 않는다
}


console.log('메인1 종료--------------')

try{
    console.log('try 시작')

    let myee = new Error('내가만든 에러 객체')
        throw myee // 에러발생 , 에러 던지기 -> catch진입

    data = fs.readFileSync('../fff/없는파일.text') // 에러발생시 catch 구간으로 진입
                                                 //에러가 발생하면  이하 구문 실행 안함, 에러가 없는 정상 파일로 작동하면 그대로 실행
    console.log('data:',data.toString())
    console.log('try끝')
} catch (error) {  //에러발생시 진입
    console.log('에러발생5:',error.message) 
}


console.log('메인2 종료--------------')
fs.readFileSync('../fff/없는파일.text') // 에러시점에서 현재 구간(지금은 메인) 탈출
console.log('메인3 종료--------------') //에러발생이후 구문 실행 안함

try{
    console.log(10-'나는 문어')

}catch(error){
    console.log('에러발생')// 진입안함
}

console.log('메인4 종료--------------')