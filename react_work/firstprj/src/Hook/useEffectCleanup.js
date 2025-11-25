import React, { useEffect, useState } from 'react';

let no = 0
function useEffectCleanup(props) {

    const [tt,setTT]= useState(0)

    useEffect(()=>{
        console.log('UseEffectCleanup: useEffect실행')

        // 마운트 마다setInterval 생성 실행 
        const timer = setInterval(()=>{
            no++
            setTT(no)
        },1000)

        //cleanup : 컴포넌트unmount 실행
        //return 에서 cleanup 시행 하는 시점을 만든다.
        return ()=>{
            console.log('cleanup 실행')
            clearInterval(timer)
        }
    },[])

    return (
        <div>
            <h1>useEffectCleanup입니다</h1>
            <div> tt : {tt} </div>
        </div>
    );
}

export default useEffectCleanup;