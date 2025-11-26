import React from 'react';
import { Outlet ,Routes,Route, useParams} from 'react-router-dom';

function Notice(){
    return<div>
        <h2>공지사항이야</h2>
        <Outlet/>
    </div>
}

function Nlist(){
    return<div>
        <h2>목록이야</h2>
    </div>
}

function Ndetail(){
    const data = useParams()
    return<div>
        <h2>상세야</h2>
        <div>no : {data.no}</div>
    </div>
}

function SubRoute(props) {
    return (
        <Routes>
            <Route path='/notice' element={<Notice/>}>
                <Route path='/list' element={<Nlist/>}/>
                <Route path='/detail' element={<Ndetail/>}/>
                <Route path='/service/:no' element={<Nrrr/>}/>
                
            </Route>
        </Routes>
    );
}
<Route path='/notice'>

</Route>
export default SubRoute