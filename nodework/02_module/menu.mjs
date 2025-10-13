// 주식,후식 메뉴 목록 만들기
// 시간을 아침 , 점심, 저녁 으로 나누기
// 현재 시간 알기
// 시간에 따라 메뉴를 분류
// 현재 시간과 맞는 메뉴 찾기
// 메뉴를 출력



const now = new Date();
const hours = now.getHours();

console.log(now,hours)

if(hours >= 0 && hours <= 10){
    console.log("아침밥 메뉴입니다")
    const{menu1,menu2} = await import('./mg.js')
    console.log(menu1,menu2)
}
else if(hours >= 11 && hours <= 16){
    console.log("점심밥 메뉴입니다")
    const{js1,js2} = await import('./js.js')
    console.log(js1,js2)
}
else {console.log('저녁메뉴입니다')
    const{jj1,jj2} = await import('./jj.js')
    console.log(jj1,jj2)
}



