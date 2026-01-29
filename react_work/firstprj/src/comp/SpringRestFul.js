import React, { useEffect, useState } from 'react';

function SpringRestFul(props) {

    const [data,setData] = useState("처음이지롱");
    useEffect(()=>{
        fetchData()
    },[])


    const fetchData=()=>{
         fetch('http://192.168.0.36/rest/per')      //   http://192.168.0.78/test1
            .then(answer => {
                console.log('정상 : ', answer.ok, answer.status)
                //console.log('text() : ',answer.text())
                return answer.text()  // Promise 처리 -> 다음 then 으로 리턴하여 확인
            })
            .then(data => {
                console.log('data : ', data)
            })
            .catch(err => {
                console.log('에러 : ', err.message)
            })
    }

    
    return (
        <div>
           {data} 
        </div>
    );
}

export default SpringRestFul;