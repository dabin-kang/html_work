const pp = require('path')

const fName = __filename
console.log(`sep : ${pp.sep}`)                              //경로구분자 :\
console.log(`delimiter : ${pp.delimiter}`)                  //환경변수구분자 : ; 


console.log(`dirname(fName) : ${pp.dirname(fName)}`)    //fname의 폴더
console.log(`dirname(pp.dirname(fName)) : ${pp.dirname(pp.dirname(fName))}`)
console.log(`extname(fName) : ${pp.extname(fName)}`)     // 확장자
console.log(`basename(fName) : ${pp.basename(fName)}`)    //파일명
console.log(`basename(fName,'.js') : ${pp.basename(fName,'.js')}`) //확장자빠진 파일명


console.log(`parse(fName) :`, pp.parse(fName))             //파일경로분리 : root,dir,base,ext,name
let ff ={
    dir:'D\\qwer\\asdf',
    ext:'.jpg',
    name:'zxcv'
}

console.log(`ff:`,ff)
console.log(`format(ff):${pp.format(ff)}`) //파일경로객체 -> 파일경로 문자열
console.log(`normalize('aaa\\bb//ddd.txt'):${pp.normalize('aaa\\bb//ddd.txt')}`) // 여러번 사용한 경로 -> 정상적으로 수정


console.log(`isAbsolute('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL'):${pp.isAbsolute('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL')}`) //절대경로 - true
console.log(`isAbsolute('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL'):${pp.isAbsolute('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL')}`) //상대경로 - false
console.log(`relative('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL'):${pp.relative('C:\\public\\qqq\\www')}`)                    // 이동방법을 찾아주기

console.log(`join('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL'):${pp.join('C:\\public\\aaa\\bbb','../../','ccc')}`)  //경로합치기 : 절대,상대, 조소혼용 가능

console.log(`resolve('C:\\Users\\ekqls\\OneDrive\\Desktop\\SQL'):${pp.resolve('C:\\public\\aaa\\bbb','../../','ccc')}`)  // 절대경로로 표현하기



console.log(`join('/aa','/bb','/cc') : ${pp.join('/aa','/bb','/cc')}`)
console.log(`resolve('/aa','/bb','/cc') : ${pp.resolve('/aa','/bb','/cc')}`)
                                                                         // /aa ---> / root 로 인지 마지막의 cc/ 가 root에서 시작으로 인지       
                                                                         
console.log(`join('/aa','/bb','/cc') : ${pp.join('/aa','/bb','/cc')}`)                                                                         
console.log(`resolve('/aa','/bb','/cc') : ${pp.resolve('/aa','/bb','/cc')}`)




