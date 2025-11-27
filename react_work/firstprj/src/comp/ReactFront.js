import React from 'react';


function ReactFront(props) {

    function getGo() {
        console.log('getgo 실행')

        fetch('http://192.168.0.36:80')
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

    function TT() {
        fetch('/url', {
            method: 'GET'
        })
        .then(answer => {
            console.log('정상:', answer.ok)
            return answer.text()
        })
        .then(data => {//응답 데이터
                console.log('data : ', data)
        })
        .catch(err=>{ // 에러처리
            console.log('에러입니다.',err.message)
        })
    }


    function postGo() {
        console.log('postGo 실행')
    }
    function putGo() {
        console.log('putGo 실행')
    }
    function deleteGo() {
        console.log('deleteGo 실행')
    }







    return (
        <div>
            <h1>리액트 프론트</h1>
            <button onClick={getGo}>get</button>
            <button onClick={postGo}>post</button>
            <button onClick={putGo}>put</button>
            <button onClick={deleteGo}>delete</button>
        </div>
    );
}

export default ReactFront;