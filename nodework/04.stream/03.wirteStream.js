const fs = require('fs')

// 스트림쓰기객체 
const ws = fs.createWriteStream('../fff/iii.txt')

ws.on('finish',()=>{
    console.log('파일쓰기 종료')
})

ws.write('엄마가 섬그늘에')
ws.write('굴따러 가면\n')
ws.write('아기도섬그늘에\n')
ws.write('굴따러 가고\n')
ws.write('아빠도 섬그늘에\n')
ws.write('굴따러 가고\n')
ws.write('모두가 시장에서 굴장사하고\n')


// 스트림 종료 하기
ws.end()