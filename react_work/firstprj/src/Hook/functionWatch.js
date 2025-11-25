import React, {useEffect, useState} from 'react';
import './funcWatch.css'

function FunctionWatch(props) {

    const [sec , setSec] = useState(0)
    

    useEffect(()=>{
        const timer = setInterval(()=>{
            setSec(prev => prev + 1)
        },1000)


        return()=>{
            clearInterval(timer)
        } 
    },[])

    return<>
        <h1>현재시간</h1>
        <div> sec : {sec}</div>
       <div></div>
    </>
}

export default FunctionWatch;