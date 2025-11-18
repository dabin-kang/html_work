import './bbb/comp2.css'
import  Tyty  from './bbb/header'
import  Mimi  from './bbb/main'
import  Asas  from './bbb/aside'
import  Ftft  from './bbb/footer'


function Main(){

    return<section>
        <h1>전체를 감싸는 컴포넌트</h1>
        <Tyty/>
        <Mimi/>
        <Asas/>
        <Ftft/>
    </section>

}

export default Main