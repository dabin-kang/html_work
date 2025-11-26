function rrr (stst,acttt){
    console.log('rrr 실행',acttt)
    console.log('stst',stst)

    if(acttt === 'ppp'){
        return{vvv:stst.vvv+1}// 새로운 상태를 반환
    }
     if(acttt === 'mmm'){
        return{vvv:stst.vvv-1}
    }

    return{vvv:1234}//기본 상태 반환
}

export default rrr