import PropStud  from "./prop/propStud"
import '../comp/prop2.css'
//부모 컴포넌트

// 한 개의 배열 요소로 생성
let arr = [
    {pname:'하나빈',jum:[77,81,21]},
    {pname:'둘빈',jum:[72,89,18]},
    {pname:'셋빈',jum:[76,81,48]},
    {pname:'넷빈',jum:[78,78,11]},
    {pname:'다섯빈',jum:[71,81,12]},
    {pname:'여섯빈',jum:[78,81,23]},
]


// 함수 생성
function rrr(){

    //출력하기
    return<>
        <h1>학생목록</h1>
        
        <section>
        {/* 변수 데이터를 map으로 받고 */}
        {/* PropStud 를 호출하면서 데이터 던져준다 */}
        {arr.map((v,k)=><PropStud dd={v} key={k}/>)}
        </section>
    </>
}


// 내보내기
export default rrr