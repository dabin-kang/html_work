import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import App2 from './App2';
import Exam from './Exam';
import Myclass from './basic/Myclass';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>
  {/*<React.StrictMode> 개발자 모드여서 2번씩 처리함*/}
    <App /> 
    <App2 /> 
    <Exam /> 
    <Myclass/> 
  {/*</React.StrictMode>*/}
  </>
);

reportWebVitals();
