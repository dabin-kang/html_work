


let arr = [
    {pname:'하나빈',jum:[77,81,21]},
    {pname:'둘빈',jum:[72,89,18]},
    {pname:'셋빈',jum:[76,81,48]},
    {pname:'넷빈',jum:[78,78,11]},
    {pname:'다섯빈',jum:[71,81,12]},
    {pname:'여섯빈',jum:[78,81,23]},
]

function YUY(){
    return<>
        <h1>학생목록</h1>
        <section>
        {arr.map((v,k)=><Proplist dd={v} key={k} />)}
        </section>
    </>
}

export delete YUY