/*
constStud.js 를 생성하고
학생클래스를 정의, 생성자를 사용하여 5명의 학생정보를 출력하세요
단,
수:주황
우:노랑
미:녹색
양:하늘
가:핑크
배경색으로 처리하세요
*/

class Stud {
    constructor(name, kor, math, eng) {
        this.name = name
        this.kor = kor
        this.math = math
        this.eng = eng
        this.sum = kor + math + eng
        this.total = this.sum / 3

        
        if (this.total >= 80) {
            this.grade = "수"
            this.classcolor = {
            backgroundColor : 'rgba(230, 150, 59, 1)'
            }
        } else if (this.total >= 70) {
            this.grade = "우"
            this.classcolor = {
            backgroundColor : 'rgba(203, 236, 16, 1)'
        }
        } else if (this.total >= 60) {
            this.grade = "미"
            this.classcolor = {
            backgroundColor : 'rgba(30, 233, 74, 1)'
        }
        } else if (this.total >= 50) {
            this.grade = "양"
            this.classcolor = {
            backgroundColor : 'rgba(198, 183, 252, 1)'
        }
        } else {
            this.grade = "가"
            this.classcolor = {
            backgroundColor : 'rgba(87, 16, 87, 1)'
        }
        }
    }
        htmlGo(){
            return (
                <div style={this.classcolor}>
                    <div>이름 : {this.name}</div>
                    <div>국어 : {this.kor}</div>
                    <div>영어 : {this.eng}</div>
                    <div>수학 : {this.math}</div>
                    <div>등급 : {this.grade}</div>
                </div>
            )
        }
    }
function ConstSt() {
    let arr = [ new Stud('손흥민', 70, 80, 90),
                new Stud('발흥민', 50, 80, 90), 
                new Stud('코흥민', 10, 80, 90),
                new Stud('눈흥민',30,80,90),
                new Stud('귀흥민',40,50,90)
    ]

    return (
        // <div>학생이름 : {s1.name},{s1.kor},{s1.math},{s1.eng}</div>
        <>
            {arr[0].htmlGo()}
            {arr[1].htmlGo()}
            {arr[2].htmlGo()}
            {arr[3].htmlGo()}
            {arr[4].htmlGo()}
        </>
    );
}

export default ConstSt;
