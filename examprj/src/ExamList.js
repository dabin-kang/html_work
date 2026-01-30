import React,{useState,useEffect} from "react";

function ReactExam(){

    const [data,setData] = useState("대기중")

    useEffect(()=>{
        fetch('http://192.168.0.36/examDetail/40',{
            headers:{
                'Content-Type':'application/json'
            }
        }).then(response=>response.json())
        .then(dd=>{
            console.log(dd);
            console.log()
            let vv = (<table border="">
                <tr>
                    <td>학기</td>
                    <td>{dd.hakgi}</td>
                </tr><tr>
                    <td>이름</td>
                    <td>{dd.name}</td>
                    <td>국어</td>
                    <td>영어</td>
                    <td>수학</td>
                </tr>
                
            </table>)
            setData(vv)
        })
        .catch(err=>{
            setData('대기중')
       })
    },[])
    return(
       <>{data}</>

    )

}

export default  ReactExam;