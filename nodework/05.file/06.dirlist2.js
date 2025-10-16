/*
img,music,doc,etc
하위 폴더까지 검색하세요

dst 폴더 하위 폴더를 생성하여 저장
이미지 img, jpg ,gif,png,jpg
음악 mp3, wma, wav
문서 doc,hwp,ppt,xls,
기타 위의 분류이외
*/


/*
1.fs 모듈 불러오기
2.dst 폴더 만들기
    fs.mkdir('../dst/img',{recursive:true}) 강제로 만들기

3.dst폴더 안에 하위폴더 [이미지,음악,문서,기타] 만들기
 
4.test폴더에 하위폴더 file폴더 안에 파일명 확인
5.'.'을 기준으로 확장자명을 split으로 자르기
5-1. 확장자명을 출력

6.확장자가 dst 하위폴더에 들어 갈수 있는지 기준과 비교
7.맞으면 img 폴더에 들어가고  rename(파일이동)
8.다르면 '기타'폴더에 넣기

*/

// 폴더 하나에 하나의 파일먼저 만들고 분류해보기
//node 06.dirlist2.js

const fs = require('fs').promises //  비동기 방식
const cat = {img : ['jpg','jpeg','png','gif']} // dst 하위폴더 확장자 분류기준

fs.mkdir('../dst/img',{recursive:true})
.then(()=>{
    console.log('img 폴더 생성 성공')
    return fs.readdir('../test/File')
})
.then((files)=>{
    console.log('파일목록:',files)// 파일명 확인하기
    files [1]                   // 파일 1개 만 가져오기
    console.log(files[1])
    let ext = files[1].split('.')   // . 뒤에 잘라내기 확장자로 나누기
    console.log(ext)

   if(files[1] == img){
    
   }

    
    // let ext = files[2].split('.')   // . 뒤에 잘라내기 확장자로 나누기
    // console.log(ext)
    // let ext = files[3].split('.')   // . 뒤에 잘라내기 확장자로 나누기
    // console.log(ext)

    // for(let i=0 ; i<files.length ;i++){
    //     let ext = files[i].split('.')
    //     console.log(ext)
    // }
})
.catch((err)=>{
    console.log('에러발생:',err)  
})    








