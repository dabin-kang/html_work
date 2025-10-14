// const fs = require('fs')
// fs.readFile('../fff/aaa.text', (err, data) => {
//     if (err) {
//         console.log('파일에러')
//     } else {
//         //console.log(data)
//         //console.log(data.toString())
//         let arr = data.toString().split('/r/n')
//         console.log(arr)
//     }
// })



//농구팀  txt파일을 각각 작성
//등번호,이름,포지션으로 나누기
//각 선수들을 포지션으로 배열
//출력

/*
const fs = require('fs');
const path = require('path');

const filePath = [
    path.join(__dirname, '../fff/bs.txt'),
    path.join(__dirname, '../fff/hn.txt'),
    path.join(__dirname, '../fff/nn.txt'),
];

for (const path of filePath) {
    fs.readFile(path, (err, data) => {
        if (err) {
            console.error('파일 불러오기 에러: ', err);
            return;
        }

        const arr = data.toString().split('\r\n');

        for (const team of arr) {
            const teaminfo = team.split(',');
            const position = teaminfo[2];
            
        }
    });
}
    */



