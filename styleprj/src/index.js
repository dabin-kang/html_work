import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
// import VarGo from './components/varGo';
// import NestingGo from './components/NestingGo';
// import CalcGo from './components/CalcGo';
// import ImGo from './components/ImGo';
// import ForGo from './components/ForGo';
// import MixinGo from './components/MixinGo';
// import FuncGo from './components/FuncGo';
// import ClassNamesGo from './components/ClassNamesGo';
import ClassNameBindGo from './components/ClassNameBindGo';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <VarGo /> */}
    {/* <NestingGo /> */}
    {/* <CalcGo /> */}
    {/* <ImGo /> */}
    {/* <ForGo /> */}
    {/* <MixinGo /> */}
    {/* <FuncGo /> */}
    {/* <ClassNamesGo /> */}
    <ClassNameBindGo st='ccc' />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
