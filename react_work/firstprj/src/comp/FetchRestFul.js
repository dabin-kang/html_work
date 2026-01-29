import React, { useEffect, useState} from 'react';

//ip주소 시작점을 /bkMem 으로 설정
// backUrl 로 함수 밖에서 전역 함수  주소로 만듬
//ip로 직접작성해야 프론트앤드서버에 다른 컴퓨터에서 접근해도 정상처리됨
//http://localhost:5000/test1 로 하지 말것
let backUrl = 'http://192.168.0.36:5000/bkMem'

//MemList() 함수를 생성
//처음 화면으로 만들 컴포넌트
function MemList(props) {

    //함수형 state 만들기
    //서버에서 가져온 목록을 값으로 넣는다.
    const [arr, setArr] = useState([])

    //getGo(){}매서드
    function getGo() {
        console.log('getGo 실행')

        fetch(backUrl,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json'  //데이터 수신타입 설정 - json
                    // answer.json() 처리 하기 때문에 생략해도 무방
                },
            }
        )
            .then(answer => answer.json())  //json 형태로 받기 - object
            .then(data => {
                console.log('받은데이터 ', data)
                setArr(data)
            })
            .catch(err => console.log('에러 : ', err.message))
    }

    //1. 컴포넌트가 처음 렌더링 되면 실행
    //서버에서 전체 목록을 받아서 MemList()의 상태값arr에 넣는다
    useEffect(() => {
        getGo()
    }, [])


    function goDetail(i){
        props.goNo(i)
        props.goService('detail')
    }


        return <div>
        <h2>목록</h2>
        {/* 삼항연산자로 비교해서 0이면 로딩중 화면이 출력 */}
        {/* 0이 아니라면 v,k값을 가져와서 나열한다 */}
        {arr.length === 0 ? <div>로딩중</div> :
            <section>
                {arr.map((dd, i) => <div key={i} onClick={()=>goDetail(i)}>{JSON.stringify(dd)}</div>)}
                <button onClick={()=>props.goService('insert')}>insert</button>
                <button onClick={()=>props.goService('delete')}>delete</button>
            </section>
        }
    </div>

}

function MemDetail(props){

    const [memData, setMemData] = useState({})
    function sendGo() {
        console.log('sendGo 실행')
       
        fetch(`${backUrl}/${props.no}`,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json'  //데이터 수신타입 설정 - json
                    // answer.json() 처리 하기 때문에 생략해도 무방
                },
            }
        )
            .then(answer => answer.json())  //json 형태로 받기 - object
            .then(data => {
                console.log('받은데이터 ', data)
                setMemData(data)
            })
            .catch(err => console.log('에러 : ', err.message))
    }

    useEffect(() => {
        sendGo()
    }, [])

    function goModify(){
        props.goNo(props.no)
        props.goService('modify')
    }

    return <div>
        <h2>상세</h2>
        {memData.length === 0 ? <div>상세 로딩중</div> :
            <section>
                {JSON.stringify(memData)}
                <button onClick={goModify}>modify</button>
                <button onClick={()=>props.goService('list')}>목록으로</button>
            </section>
        }
    </div>
}
function MemInsert(props) {
    function sendGo() {
        const frm = document.forms.frm
        //FormData 객체 생성 --> frm 요소를 이용하여 FormData 객체 생성
        const data = new FormData(frm)

        console.log(data)     //object

        fetch(backUrl,
            {
                method: 'POST',
                body: data
            }
        )
            .then(answer => answer.text())
            .then(data =>{
                console.log(data)
                alert('가입성공')
                props.goService('list')
            })
            .catch(err => console.log('에러 : ', err.message))

    }

    return <div>
        <h2>멤버가입</h2>
        <form method="post" name="frm">
            pid <input type="text" name="pid" /><br />
            pw <input type="text" name="pw" /><br />
            age <input type="text" name="age" /><br />
            marriage <input type="text" name="marriage" /><br />
        </form>
        <input type="button" value="가입" onClick={sendGo} />
        <button onClick={()=>props.goService('list')}>목록으로</button>
    </div>
}

function MemModify(props){

    const [pid, setPid] = useState('')
    const [age, setAge] = useState('')
    const [marriage, setMarriage] = useState('')
    const [pw, setPw] = useState('')


    // function sendGo(){
    //     // PUT 은 formData로 전송불가
    //     //const frm = document.forms.frm
    //     //const data = new FormData(frm)

    //     const data = { no, pid, age, marriage, pw }
    //     console.log('수정보내기전', data)     //object

    //     fetch(backUrl,
    //         {
    //             method: 'PUT',
    //             body: JSON.stringify(data),
    //             headers: { 'Content-Type': 'application/json' },  //post 데이터 전송타입 설정 - json
    //         }
    //     )
    //         .then(answer => answer.text())
    //         .then(data =>{
    //             console.log(data)
    //             alert('수정성공')
    //             goDetail()
    //         })
    //         .catch(err => console.log('수정에러 : ', err.message))
    // }

    function goDetail(){
        props.goNo(props.no)
        props.goService('detail')
    }

    return <div>
        <h2>멤버수정</h2>

        no       <input type="text" value={props.no}/><br />
        pid      <input type="text" value={pid} onChange={(e) => setPid(e.target.value)} /><br />
        pw       <input type="text" value={pw} onChange={(e) => setPw(e.target.value)} /><br />
        age      <input type="text" value={age} onChange={(e) => setAge(e.target.value)} /><br />
        marriage <input type="text" value={marriage} onChange={(e) => setMarriage(e.target.value)} /><br />

        <input type="button" value="수정" onClick={sendGo} />
        <button onClick={goDetail}>뒤로</button>
        </div>
}


function MemDelete(props){

    const [no, setNo] = useState(2)

    function sendGo() {

        fetch(`${backUrl}/${no}`,
            {
                method: 'DELETE',
            }
        )
            .then(answer => answer.text())
            .then(data =>{
                console.log(data)
                alert('삭제성공')
                props.goService('list')
            }) 
            .catch(err => console.log('삭제에러 : ', err.message))
    }

    return <div>
        <h2>멤버삭제</h2>

        no <input type="text" value={no} onChange={(e) => setNo(e.target.value)} /><br />

        <input type="button" value="삭제" onClick={sendGo} />

        {/* 목록페이지로 이동하기 버튼 */}
        <button onClick={()=>props.goService('list')}>목록으로</button>
    </div>
}

function FetchRestFul(props) {
    //state를 사용하여서 기본값을 list로 만든다.
    // service 라는 상태 값으로 페이지 전환을 구현하게 한다
    const [service, setService] = useState('list')
    const [no,setNo] = useState(2)

    return (
        <div>
            <h1>FetchRestFul</h1>

            {/* service상태값에 따라 어떤 화면을 보여줄 것인지 결정 함 */}
            {service ==='list'&& <MemList goNo={setNo} goService={setService}/>}
            {service ==='detail'&& <MemDetail goNo={setNo} goService={setService}/>}
            {service ==='insert'&& <MemInsert goService={setService}/>}
            {service ==='modify'&& <MemModify goNo={setNo} goService={setService}/>}
            {service ==='delete'&& <MemDelete goNo={setNo} goService={setService}/>}

        </div>
    );
}

export default FetchRestFul;