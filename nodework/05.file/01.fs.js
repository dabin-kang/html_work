const fs = require('fs').promises
const constants = require('fs').constants

//폴더 , 파일 존재 유무 확인
fs.access('../fff/dd1',constants.F_OK).then(()=>{
    console.log('dd3 존재')
}).catch((err)=>{
    console.log('dd3 없음')
})


fs.access('../fff/dd3',constants.F_OK).then(()=>{
    console.log('dd1 존재')
}).catch((err)=>{
    console.log('dd1 없음')
})


fs.access('../fff/dd1/ee1',constants.F_OK).then(()=>{
    console.log('dd1/ee1 존재')
}).catch((err)=>{
    console.log('dd1/ee1 없음')
})


//폴더 생성
fs.mkdir('../fff/dd4').then(()=>{
    console.log('dd4 폴더 생성 성공')
}).catch((err)=>{
    console.log('dd4 폴더 생성 에러')  // 이미 존재하는 경우 생성 할 수 없기 때문에 2번째 실행은 에러
})




fs.mkdir('../fff/dd5/ee5').then(()=>{
    console.log('/dd5/ee5 폴더 생성 성공')
}).catch((err)=>{
    console.log('/dd5/ee5 폴더 생성 에러')  // dd5가 존재하지 않아 dd5안에  ee5를 생성불가
})

//{recursive:true}를 활용해서 dd6를 만든 뒤 ee6 생성
fs.mkdir('../fff/dd6/ee6',{recursive:true}).then(()=>{
    console.log('/dd6/ee6 폴더 생성 성공')
}).catch((err)=>{
    console.log('/dd6/ee6 폴더 생성 에러')  
})

// 폴더,파일 이름변경
fs.rename('../fff/dd6','../qqq/aa6').then(()=>{
    console.log('dd6 ->aa6이름 바꾸기 (이동)성공') // 폴더 안의 내용도 같이 이동
}).catch((err)=>{
    console.log('dd6 ->aa6이름 바꾸기 (이동)에러')  
})


// 파일삭제
fs.unlink('../fff/examRes.csv').then(()=>{
    console.log('examRes.csv 삭제 성공')
}).catch((err)=>{
    console.log('examRes.csv 삭제 에러') 
})

//폴더삭제
fs.rmdir('../fff/dd7').then(()=>{
    console.log('dd7 삭제 성공')
}).catch((err)=>{
    console.log('dd7 삭제 에러')  // 하위 폴더가 있으면 삭제 불가능이 기본값
})


// {recursive:true}  하위폴더 및 파일이 있어도 모두 삭제 가능
fs.rmdir('../fff/dd1/ee2',{recursive:true}).then(()=>{
    console.log('dd1/ee2 삭제 성공')
}).catch((err)=>{
    console.log('dd1/ee2 삭제 에러')    
})


fs.cp('../fff/dd1','../qqq/aa1',{recursive:true}).then(()=>{
    console.log('dd1 ->aa1복사성공') //
}).catch((err)=>{
    console.log('dd1 ->aa1 복사 에러')  
})
