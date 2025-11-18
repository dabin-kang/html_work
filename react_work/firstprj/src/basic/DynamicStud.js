// 학생이 기본으로 가져야 할 정보
class Stud{

    constructor(kind,name, ... jum){
        this.kind = kind
        this.name = name
        this.jum = jum

        this.totCalc()
        this.calc()
    }


    totCalc(){
        this.tot =0
        for(const j of this.jum){
            this.tot +=j
        }
    }

    calc(){}

    ppp(i){
        return <div key ={i}>{this.kind}{this.name}{this.tot}{this.avg}</div>
    }
}

class GenStud extends Stud{
    constructor(name,kor,eng,mat){
        super('일반',name,kor,eng,mat) //부모생성자 --> 자식클래스에서 생성자를 명시할 경우 부모생성자를 필수 지정해야 한다.
    }
    calc(){
        this.avg=this.tot/this.jum.length
    }
}

class ArtStud extends Stud{
    constructor(name,kor,eng,mat,art){
        super('예능',name,kor,eng,mat,art) //부모생성자 --> 자식클래스에서 생성자를 명시할 경우 부모생성자를 필수 지정해야 한다.
    }

    calc(){
        this.avg = 0
        let rate =[0.05,0.1,0.15,0.7]
        for (const j of this.jum){
            this.avg += this.jum[j]*rate[j]
        }
    }
}

let sts = [
    new GenStud('차차은우',78,20,10),
    new ArtStud('이차은우',78,80,60),
    new GenStud('삼차은우',76,81,90),
    new ArtStud('사차은우',78,84,90)
]

function trtr(){

    return<>
        <h1>다형성 학생</h1>
       {sts.map((v,k)=> v.ppp(k))}
    </>

}

export default trtr


/*
도형 : 부모 클래스
도형이름, 넓이,둘레

자식클래스 - 직사각형, 원

직사각형 2
원3
직사각형2,원3 정보를 출력하세요
*/