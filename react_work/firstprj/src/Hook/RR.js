import TT from './RR2'

let arr = [
    {ww:10, hh:20},
    {ww:20, hh:20},
    {ww:30, hh:20},
    {ww:40, hh:20}
]

let Stud = [
    {pname: '강다빈',kor:20,math:40},
    {pname: '산다빈',kor:20,math:43},
    {pname: '바다다빈',kor:22,math:40}
]

function RR(props) {



    return (
        <div>
           {arr.map((v,k)=> <TT dd={v} key={k}/>)}
           {Stud.map((v,k)=> <TT dd={v} key={k}/>)}

         
        </div>
    );
}

export default RR;