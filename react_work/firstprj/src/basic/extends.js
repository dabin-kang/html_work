class Par{
    aa = 100
    bb = '부모b'

    fn_1(){
        return<div>부모 fn_1() : {this.aa},{this.bb}</div>
    }

    fn_2(){
        return<div>부모 fn_2() : {this.aa},{this.bb}</div>
    }
}




/*
 상속 class
 */
class Child extends Par{//,Uncle{ 다중상속 불가
    cc = '자식cc'

    fn_3(){
        return<div>자식 fn_3() : {this.cc}</div>
    }

    fn_4(){
        return<div>자식 fn_4() : {this.aa},{this.bb},{this.cc}</div>
    }
}

// 같은 부모로 다른 자식클래스 정의 가능
class Son extends Par{
    dd = '나는 아들'

    fn_5(){
        return<div>아들 fn_5() : {this.aa},{this.bb},{this.cc}</div>
    }
}




let pp = new Par()
let cc1 = new Child()
let cc2 = new Child()

pp.aa = 1234
cc1.bb = '부모 비비'
cc2.cc = '아이cc'
let ss = new Son()


function wewer(){
    return<>
    <h1>상속자 입니다</h1>
    부모 : {pp.aa},{pp.bb}
    <br/>
    {pp.fn_1()}{pp.fn_2()}
    <br/>
    {pp.cc}
    <br/>
    {/* {pp.fn_3()} 부모객체 : 자식 멤버 접근 불가*/}
    <hr/>
    자식1 : {cc1.cc},{cc1.aa},{cc1.bb}
    <br/>
    {cc1.fn_3()},{cc1.fn_1()},{cc1.fn_2()},{cc1.fn_4()}

    <hr/>
    자식2 : {cc2.cc},{cc2.aa},{cc2.bb},{cc2.dd}
    <br/>
    {cc2.fn_3()},{cc2.fn_1()},{cc2.fn_2()},{cc2.fn_4()}

    <hr/>
     아들 : {ss.dd},{ss.aa},{ss.bb},{/*{ss.cc}  형제클래스 멤버 접근 불가*/}
    <br/>
    {ss.fn_5()},{ss.fn_1()},{ss.fn_2()}
</>

}



export default wewer

