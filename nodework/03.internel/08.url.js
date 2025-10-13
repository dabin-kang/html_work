const url = require('url')

const webtoon = new url.URL('https://zzzz:adekjf@comic.naver.com:8088/webtoon/detail?titleId=821793&no=10&no=20&no=30&week=mon')
console.log(`webtoon >>>`,webtoon)
console.log(`url.format`,url.format(webtoon)) //url객체 -> 문자열
const param =webtoon.searchParams
console.log(`searchParams:`,param)
console.log(`searchParams.get('no') :`,param.get('no'))         //최초 1개 리턴
console.log(`searchParams.getAll('no') :`,param.getAll('titleId'))  // 배열로 리턴

console.log(`searchParams.get('no') :`,param.get('vvbb'))         //없으면 null
console.log(`searchParams.getAll('no') :`,param.getAll('no'))  // 배열로 리턴 [ '10', '20', '30' ]

console.log(`searchParams.get('no') :`,param.get('titleId'))          //배열로 리턴 [821793]
console.log(`searchParams.getAll('no') :`,param.getAll('vvbb'))  // param이 없어도 배열로 리턴
console.log(`searchParams.has('titleId') :`,param.has('titleId'))     // 존재유무 - true
console.log(`searchParams.has('vvbb') :`,param.has('vvbb'))           // 존재유무- false

console.log(`searchParams.keys() :`,param.keys())                     //key 로 구성된 배열 
console.log(`searchParams.values() :`,param.values())                 //values 로 구성된 배열 


param.set('week','sun')
console.log(`set('week','sun'):`,param)

param.set('age','26')
console.log(`set('age','26'):`,param)
param.append('age','78')
param.append('titleId','poiu')         // 기존param 과 같은 key 로 추가기능
console.log(`다중 append:`,param)
console.log(`searchParams.grtAll('tutleId):`,param.getAll('titldId'))
param.delete('no')                      // 같은 key  에 해당하는 param 모두 삭제
param.delete('week')
console.log(`delete:`,param)
console.log(`webtoon:`,webtoon)// 변경내용을 상위객체에서도 반영 : 주소참조 형태
console.log(`param.toString():`,param.toString())// param 객체 => 문자열

