import Qwer from'./aaa/qwer' 
import Erty from './aaa/asdf'

let arr = []
for (let i = 0 ; i <5; i++){
    arr.push(<Erty/>)
}

function wewe(){


    return<>
    <h1>컴포넌트 1입니다</h1>
     <Qwer/>{/*//wewer()실행 */}
     <Qwer/>
     <Erty/>
     <Erty/>

    <hr/>
    {arr}


    </>
}

export default wewe