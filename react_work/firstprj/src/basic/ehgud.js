/*
도형 : 부모 클래스
도형이름, 넓이,둘레

자식클래스 - 직사각형, 원

직사각형 2
원3
직사각형2,원3 정보를 출력하세요
*/


// 부모 class
class DDD{
    ppp(k){
        return<div key={k}>
            {this.name},
            {this.ext},
            {this.cir}
        </div>
        //부모에서 선언하기
    }
}



// 자식 클래스
class RR extends DDD{
    constructor(name,ww,hh){
        super()
        this.name = '사각형'
        this.ext = ww*hh
        this.cir = (ww+hh)*2
    }
}

// 자식 클래스
class SC extends DDD{
    constructor(name,bj){
        super()
        this.name = '원'
        this.ext = Math.round(bj**2*3.14)
        this.cir = Math.round(bj*2*3.14)
    }
}


// 변수 배열
let EEE = [
new RR ('RR1',10,20),
new RR ('RR2',15,40),
new SC ('SC1',10),
new SC ('SC2',20),
new SC ('SC3',35),
]


// 출력 함수
function ehgud(){
    return<>
    <h1>도형 출력</h1>
{EEE.map((v,k)=> v.ppp(k))}
    </>
}


// 내보내기
export default ehgud