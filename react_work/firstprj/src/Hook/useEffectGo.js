import React, { useEffect,useState } from 'react';
import UseEffectCleanup from'../Hook/useEffectCleanup'
function useEffectGo(props) {

    const [pname,setPname] = useState('차은우')
    const [age,setAge] = useState(26)
    const [marriage,setMarriage] = useState(false)
    const [show,setshow] = useState(true)

    useEffect(()=>{
        //componentDidMount + componentDidUpdate
        // 마운트 결합 + 랜더링시
        // 일반형
        console.log("useEffect 실행1")
    })

    // ,[]  를 추가
    // 업데이트 할 때는 알수 없다 , 최초 마운트 될 때 한 번만 실행
    useEffect(()=>{
        //componentDidMount
        // 마운트 결합
        //Ref와 함께 자주 사용
        console.log("useEffect 실행2")
    },[])

    useEffect(()=>{
        //componentDidMount
        // 마운트 결합
        console.log("useEffect 실행3")
       //pname,marriage을 변경 할 때만 작동한다, 다른거 변경할때는 작동을 안 한다. 
    },[pname,marriage])

    return (
        <div>
            <h1>useEffectGo입니다</h1>
            <div>panme : <input value={pname} onChange={(e)=>setPname(e.target.value)}/></div>
            <div>age : {age}<button onClick={()=>setAge(age+1)}>나이증가</button></div>
            <div>marriage : {marriage+''}<button onClick={()=>setMarriage(!marriage)}>변경</button></div>

            <button onClick={()=>setshow(!show)}>{show?'제거':'보이기'}</button>

            {/* show가 true일때 만 실행 */}
            {show && <UseEffectCleanup/>}
        </div>
    );
}

export default useEffectGo;