
//무식하게 집어넣기
let arr1 =[10,20,30,40,50]

//순서대로 하나씩 넣기
let arr2 =[<div key='aa'>box1</div>,<div key='aa22'>box2</div>,<div key='aa44'>box3</div>]// key에러를 없애기 위해 key값을 넣는다
let arr3 = []

//for 반복문
for (let i = 0; i < 5 ; i++) {
    let ee = <div key={'aa55'+i}>새로만든box{i}</div>

    // arr3 에 ee 를 넣는다.
    arr3.push(ee)
}

//배열원소 가져오기
let data4 = ['정우성','정남성','북극성']

//비어있는 빈 배열
let arr4 = []

//반복문 in
for(const i in data4){
    console.log(i,data4[i])
    let ee = <div key={'ss'+i}>{data4[i]}</div>
    arr4.push(ee)
}

console.log('fofEach--------------------------------------')
let arr5 = []
data4.forEach((vv,kk)=>{
    console.log(kk,vv)
    let ee = <div key={'ss'+kk}>{vv}</div>
    arr5.push(ee)
})

console.log('map--------------------------------------')
let arr6 = data4.map((vv,kk)=>(
    <div key={'mm'+kk}>{vv+'map'}</div>// 각 원소를 변환하여 arr6의 원소로 push
))

//key 배열로 구성
let data7 = {
    최수종 :'태조왕건',
    한석규 :'세종대왕',
    이서진 :'정조'
}

console.log('entries', Object.entries(data7))
console.log(data7)
console.log('keys', Object.entries(data7))
console.log('values', Object.entries(data7))

let arr7 = Object.entries(data7).map(([vv,kk] , i )=>{
    console.log(i,kk,vv)
    return<div key ={kk}>{vv+'en'}</div>
})
console.log(arr7)




console.log('filter--------------------------------------')
let data8 = [50,21,35,40,90,17] // 짝수출력하기
let even1 =[]
for (const ee of data8){
    if(ee%2 == 0){
        even1.push(ee)
    }
}
console.log('even1',even1)


//결과 true인 원소만 필터링
let even2 = data8.filter((vv,kk)=> vv%2 == 0)
console.log('even2',even2)






function qwert(){
    return<>
        <h1>배열입니다</h1>
        <div>{arr1}</div>
        <hr/>
        {arr2}
        <hr/>
        {arr3}
        <hr/>
        {arr4}
        <hr/>
        {arr5}
        <hr/>
        {arr6}
        <hr/>
        {data4.map((vv,kk)=>(
        <div key={'mm'+kk}>{vv+'render'}</div>// 각 원소를 변환하여 arr6의 원로로 push
        ))}
        <hr/>
        {/* 키배열은 jsx 문법으로 출력불가 */}
        {/* {data7} */}
        <hr/>
        {/* {data4.map((vv,kk)=>(
        <div key={'mm'+kk}>{vv+'render'}</div>
        ))} */}
        <hr/>
        {arr7}

        {data8.filter((vv,kk)=> vv%2 == 0).map((vv,kk)=>(
            <div key = {'ff'+kk}>{vv+'filter'}</div>
        ))}

    </>
}

export default qwert

/*MapRec.js 파일을 생성하고
5개의 직사각형 객체를 클래스
생성자를 이용하여
배열형태로 출력하세요
map를 이용할 것 */