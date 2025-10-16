const fs = require('fs')

const fName = 'aaa.text'

const st = fs.statSync(`../fff/${fName}`)
console.log(`파일여부확인 : ${st.isFile()}`)
console.log(`폴더여부확인 : ${st.isDirectory()}`)
console.log(`파일크기 : ${st.size}byte`)  // 기본 단위 바이트
console.log(`생성시간 : ${st.birthtime}`)
console.log(`수정시간 : ${st.mtime}`)
console.log(`접근시간 : ${st.atime}`)