let cnt = 0

console.log(`qwer 입니다 ${cnt}`) 
// import 시 바로 실행
//여러 번 실행 해도 1번만 실행




// 함수 기반 Component
function qwqw(){ //<Qwer/> 호출시 실행 됨

    let no = 0
    cnt++
    console.log(`wewer()실행 ${cnt} ${no}`) // import한다고 바로 실행 안됨

    return<div>werwer 호출 {cnt},{no}</div>
}
    export default qwqw