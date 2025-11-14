function qwer(){
    function fn(){
                    if(jum >= 80){
                        return <div>fn우수</div>
                    }else if (jum >= 60){
                        return <div>fn양호</div>
                    }
                    return <div>fn미흡</div>
                }
   

    let jum = 88
    return(
        
        <>
            <h2>qwer 입니다</h2>
            {jum >= 80 ? '합격' : '불합격'}{/* 문자형태로만 들어간다*/}
            <br/>

            {jum >= 80 ? <div>합격2</div> : <div>불합격2</div>} {/* 엘리먼트 형태를 갖추어서 들어간다*/}
            <br/>

            {jum >= 80 && '합격일때만 보이게 하기'}
            <br/>

            <input type="checkbox"/>합격3
            {/*<input type="checkbox"{jum >= 80 &&checked} />합격4*/}
            <input type="checkbox" checked={jum >= 80} />합격5

            {/*{if(jum >= 80) '합격6'}  if를 직접사용 불가능*/}

            {fn()}

            {
                 (function fn(){
                    if(jum >= 80){
                        return <div>fn우수</div>
                    }else if (jum >= 60){
                        return <div>fn양호</div>
                    }
                    return <div>fn미흡</div>
                })()
            }


            {
                 (()=>{
                    if(jum >= 80){
                        return <div>화살표 우수</div>
                    }else if (jum >= 60){
                        return <div>화살표 양호</div>
                    }
                    return <div>fn미흡</div>
                })()
            }

        </>
    )
}

export default qwer


/*
exam.js 를 생성하고
이름, 국어,영어,수학, 총점,평균,등급을 출력하세요.

*/