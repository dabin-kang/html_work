import { Component } from "react";
import GHG from "./classBRDchild";



class CVC extends Component{

 // 부모 class에서 5개의 정보를 배열형태로 가지고 있다.
    arr = [
        {pname:'짜장면',mn:8000,int :3},
        {pname:'짬뽕'  ,mn:9000,int:2},
        {pname:'탕수육',mn:12000,int :7},
        {pname:'볶음밥',mn:8000,int :5},
        {pname:'깐풍기',mn:7000,int :6}
    ]
   
    //랜더링
    render(){
        return<>
            <h1>부모 class</h1>
            {this.arr.map((v,k)=> <GHG key={k} sub={v}/>)}

        </>
    }

}

//내보내기
export default CVC