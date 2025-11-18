class Grand{
        gg = '할아버지gg'
        fn_gg(){
            return<div>할아버지fn_gg() {this.gg}</div>
        }
}



class Par extends Grand{
    aa = '부모aa'
    bb ='부모bb'

    fn_1(){
        return<div>부모fn_1() {this.aa}{this.bb}</div>
    }

    fn_2(){
        return<div>부모fn_2() {this.aa}{this.bb}</div>
    }
    fn_tot(){
        return<div>
            부모 fn_tot 시작
            {this.fn_1()}
            부모 fn_tot 끝
        </div>
    }
     fn_gg(){
            return<div>부모가 오버라이딩fn_gg() {this.gg}{this.aa}{this.bb}</div>
        }
}


class Child extends Par{
    aa = '자식 aa' // hiding (숨김)
    cc ='자식 cc'

    fn_1(){ // overriding
        return<div>자식fn_1() {this.aa}{this.bb}{this.cc}</div>
    }

    fn_3(){
        return<div>자식fn_3() {this.aa}{this.bb}{this.cc}</div>
    }

    fn_4(){// 메서드 정의부 안에서 할아버지를 들고 올수있다.
        return <div>
            자식 fn_4 시작
            {this.fn_1()}
            {super.fn_1()}
            this : {this.aa}
            super:{super.aa}
            {/* 부모 멤버메소드 접근 가능 
                부모 멤버변수 접근 불가능 */}
                {this.fn_gg()}
                {super.fn_gg()}
                {/* {super.super.fn_gg()} 부모클래스에 재정의한 메소드 이전의 super 메소드 접근 불가*/}
            자식 fn_4 끝
        </div>
    }
}

let pp = new Par()
let cc = new Child()



function uiui(){

    return<>
        <h1>재정의</h1>
        부모 : {pp.aa},{pp.bb}
         {pp.fn_1()},{pp.fn_2()}{pp.fn_tot}
        <hr/>
        자식 :{cc.aa},{cc.bb},{cc.cc}
        {cc.fn_1()}{cc.fn_2()}{cc.fn_3()}{cc.fn_tot()}
        <hr/>
        {cc.fn_4()}
        {/* {cc.super.fn_1()}  super,this 클래스 정의부에서만 사용가능*/}
        {cc.gg}
        {cc.fn_gg()}
    </>
}

export default  uiui