import RT from './prop/propRR'

let arr = [
    {rr1 :'사각형1', ww : 10 , hh : 22},
    {rr1 :'사각형2', ww : 12 , hh : 24},
    {rr1 :'사각형3', ww : 14 , hh : 26},
    {rr1 :'사각형4', ww : 16 , hh : 28},
    {rr1 :'사각형5', ww : 18 , hh : 30}
]

function RRlist(){
    return<>
        <h1>사각형 리스트</h1>
        {arr.map((v,k)=> <RT dd={v} key={k}/>)}
    </>
}
export default RRlist