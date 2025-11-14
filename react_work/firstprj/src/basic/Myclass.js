// 1. 클래스 정의
class AAA {
    a;// 멤버변수
    b;

    constructor(a, b) {
        this.a = a;
        this.b = b;
    }

    meth_1() { // 메서드 정의
        console.log("meth_1실행")
    }

    meth_2(name) { // 메서드 정의
        console.log("meth_2실행")
        return <div>{name}</div>
    }

    meth_3() { // 메서드 정의
        console.log("meth_3실행: " + this.a + "," + this.b)
    }

    meth_4() { // 메서드 정의
        console.log("meth_4실행: " + this.a + "," + this.b)
        return <div>{this.a},{this.b}</div>
    }
}

const person = (name, age) => {
    
}

class Person {
    name;
    age;

    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

// new AAA();


function qqwwee() {
    //2. 인스턴스 변수 선언
    let a1
    let a2

    //3. 인스턴스 생성 및 대입
    // 생성 : new 클래서생성자()
    a1 = new AAA(10, 20);
    a1.meth_3();
    a2 = new AAA(30, 40);
    a2.meth_3();
    //2,3 동시: 인스턴스 변수 선언 = 인스턴스 생성

    console.log('a1:', a1)

    //멤버요소 호출
    console.log('a1.a:', a1.a)
    a1.meth_1();
    a1.meth_3()

    a1.a = 1234
    a2.b = '엄마상어'

    return (
        <>
            <h1>MY class 입니다</h1>
            {a1.meth_2('Kim')}
            {a2.meth_2('Ollie')}
            <div>{a1.a}</div>
            <div>{a2.a}</div>
            {a1.meth_4()}
            {a2.meth_4()}
        </>
    )
}
export default qqwwee