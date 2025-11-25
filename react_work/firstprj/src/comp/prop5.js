import { useState } from 'react'
import { PropStud } from './prop/propStud2'

let arr = [
    {pname:'하나빈',jum:[77,81,21]},
    {pname:'둘빈',jum:[72,89,18]},
    {pname:'셋빈',jum:[76,81,48]},
    {pname:'넷빈',jum:[78,78,11]},
    {pname:'다섯빈',jum:[71,81,12]},
    {pname:'여섯빈',jum:[78,81,23]},
]

function FnSt(){
    const [state, setState] = useState(false);

    return<>
        <h1>학생목록</h1>
        <section>
            {arr.map((v,k)=><PropStud dd={v} state={state} key={k} />)}
        </section>
    </>
}

export default FnSt