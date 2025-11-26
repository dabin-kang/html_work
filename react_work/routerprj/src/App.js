import {BrowserRouter, Link, Outlet, Route, Routes, useLocation, useParams} from 'react-router-dom'
import Location  from'./components/Location'
// import SubRoute from './components/SubRoute'
import { useEffect } from 'react'

function Home(){
  console.log('홈 확인')
  return<div>
      <h2>홈이지롱</h2>
  </div>
}


function History(){

  const location = useLocation()
  const sp = new URLSearchParams(location.search)

  //Json으로 변환
  const data = Object.fromEntries(sp.entries())
  console.log('data:',data)
  return<div>
      <h2>난 연혁이야</h2>
      <div>쿼리 : {location.search} </div>
      <div>pathname : {location.pathname} </div>
      <div>hash : {location.hash} </div>
      <div>state : {location.state+''} </div>
      <div>key : {location.key} </div>
  </div>
}


function Prod(){
  return<div>
     <h2>Prod입니다 </h2>
  </div>
}

function PA(){
  return<div>
     <h2>PA입니다 </h2>
  </div>
}

function Exam(){
  const data = useParams()
  return<div>
     <h2>Exam입니다 </h2>
     <div>sid : {data.sid} </div>
  </div>
}


function Gall(){
  return<div>
    <h2>Gall입니다</h2>
    <Outlet/> {/* router 내부에 위치한 컴포넌트 */}
    <hr/>
  </div>
}

function Gspring(){
  return<div>
    <h2>Gall_봄입니다</h2>
  </div>
}

function Gautumn(){
  return<div>
    <h2>Gall_가을입니다</h2>
  </div>
}

function Getc(){
  const data = useParams()
  return<div>
    <h2>Gall_나머지입니다</h2>
    <div> eee : {data.eee} </div>
  </div>
}


function P404(){
  const data = useParams()
  return<div>
    <div> 404에러이지요 </div>
  </div>
}


function HeaderNav(){
  return<nav>
    <ul>
      <li>
        <a href='/prod'>A태그 오시는 길</a>,
        {/* a : url을 새로 입력하여 브라우저 새로고침과 같음 */}
      </li>
      

      <li>
          <Link to='/'>홈</Link>,
          {/* Link : url 변경하면서 내부페이지 이동(브라우저 새로고침 안함) */}
          <Link to='/his?age=26&pid=aaa#qwer'>연혁</Link>,
          <Link to='/loc'>오시는 길</Link>,
          <Link to='/Prod'>제품</Link>,
          <Link to='/Prod/aaa'>aaa</Link>,
      </li>

      <li>
        <Link to='/exam'>exam</Link>,{/* 불가 */},
        <Link to='/exam/aaa'>exam/aaa</Link>,
        <Link to='/exam/bbb'>exam/bbb</Link>,
        <Link to='/exam/ccc/ddd'>exam/ccc/ddd</Link>, {/* 불가 */}
      </li>

      <li>
        <Link to='/gall/spring'>봄</Link>,
        <Link to='/gall/summer'>여름</Link>,
        <Link to='/gall/autumn'>가을</Link>,
        <Link to='/gall/winter'>겨울</Link>,
      </li>
      
      <li>
        <Link to='/notice/list'>목록</Link>,
        <Link to='/notice/detail/3'>상세</Link>,
        <Link to='/notice/modify/4'>수정</Link>,
        <Link to='/notice/delete/5'>삭제</Link>,
      </li>
    </ul>
  </nav>
}



function App() {

  useEffect(()=>{
    console.log('useEffect실행')
  })

  return (
    <div className="App">
      <h2>라우터 프로젝트입니다</h2>

      <BrowserRouter>
   
    <HeaderNav/>

        <Routes>
          <Route path ='/' element={<Home/>}/>
          <Route path ='/his' element={<History/>}/>
          <Route path ='/loc' element={<Location/>}/>
          <Route path ='/Prod' element={<Prod/>}/>
          <Route path ='/Prod/aaa' element={<PA/>}/>

          <Route path ='/exam/:sid' element={<Exam/>}/>
          <Route path ='/gall' element={<Gall/>}>
                  <Route path ='spring' element={<Gspring/>}/>
                  <Route path ='autumn' element={<Gautumn/>}/>
                  <Route path =':eee' element={<Getc/>}/>
          </Route> 
          <Route  path='*' element={<p404/>}/>
        </Routes>
  {/* <SubRoute/> */}
      </BrowserRouter>
      
    </div>
  );
}

export default App;
