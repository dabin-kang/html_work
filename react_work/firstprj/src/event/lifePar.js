import { useState } from "react"
import LifeCycle from "./lifeCycle"

// Unmaunt 되는 것을 구현
function ZZZ(){

    const [showChild,setShowChild] = useState(true)

    return<>
        <h1> lifePar 입니다</h1>
        <button onClick={()=>{setShowChild(!showChild)}}>LifeCycle{showChild ?'숨기기': '보이기'}</button>
        {showChild && <LifeCycle pvv={1234}/>}
    </>
}
export default ZZZ