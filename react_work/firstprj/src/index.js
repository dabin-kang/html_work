import React from 'react';
import ReactDOM from 'react-dom/client';
// import BQQ from './'
// import FetchGo from './comp/FetchGo'
// import ReactFront from './comp/ReactFront'
 import FetchRestFul from './comp/FetchRestFul'
import reportWebVitals from'./reportWebVitals'


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>
    
    {/* <UseMemoGo /> */}
    {/* <FetchGo /> */}
    {/* <ReactFront /> */}
    <FetchRestFul />

  </>
);

reportWebVitals();
