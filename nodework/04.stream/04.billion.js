/*
1,000,000 짝수들과 짝수들의 합을 기록한 파일을 생성하세요
fff/billion.txt 파일로 저장

짝수들을 구한다
구한 짝수들을 더해서 합을 만든다
짝수,짝수의 합 데이터를 fff/billion.txt 파일에 WriteSteram 한다. 


*/ 
const fs = require('fs')
const ws = fs.createWriteStream('../fff/billion.txt')
let sum = 0

for(let i = 1 ; i <= 1000 ; i++){
    if(i%2 == 0){
        ws.write(`${i}\n`)
        sum+= i
    }
}
ws.write(`${sum}`)


// 스트림 종료 하기
ws.end()



//node 04.billion.js