// Pc를 './prop/propClass'으로 부터 불러오겠다
import Pc from './prop/propClass'

//함수를 생성
function ttl(){

    //리턴으로 보여주기
    return<>

        {/* <h1></h1>글자크기 조절 */}
        <h1>props입니다</h1>

        {/* 문자열 : '', 자료형,숫자 : {} */}
        <Pc age= {53} >장수풍뎅이</Pc>
        <Pc pname='정좌성' marriage={false}/>
        <Pc pname={1234} age= '마흔' >장수풍뎅이</Pc>
    </>
}


//내보내기
export default ttl