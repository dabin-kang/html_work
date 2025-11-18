/*MapRec.js 파일을 생성하고
5개의 직사각형을 클래스
생성자를 이용하여
배열형태로 출력하세요
map를 이용할 것 */

class RecRR{
    constructor(ww,hh){
        this.ww = ww
        this.hh = hh
        this.bb = ww * hh
        this.ee = (ww + hh)*2
    }
}


function Recmap(){
    let rr1 = [
        new RecRR(10,10),
        new RecRR(15,20),
        new RecRR(18,23),
        new RecRR(11,22),
        new RecRR(12,21)
    ]
    console.log(rr1[0],rr1[1],rr1[2],rr1[3],rr1[4])

    return<>
    <h1>직사각형입니다.</h1>
    {rr1.map((value,key)=>{
        return <div key={key}>
            {'가로' + value.ww}
            {'세로' + value.hh}
            {'넓이' + value.bb}
            {'둘레' + value.ee + '/'}
            {key + '번쨰 실행'}
            </div>
    })}
    </>
}

export default Recmap