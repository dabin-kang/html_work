//모듈을 하나만 불러와서 쓸 수 있게 만들었다.
import is from '../styles/im.module.scss';


function ImGo(props) {
    return (
        <div>
            <h1>ImGo입니다</h1>
            <div className={is.aaa}>aaa</div>
            <div className={is.bbb}>bbb</div>
            <div className={is.ccc}>ccc</div>
            <div className={is.ddd}>ddd</div>
            <div className={is.eee}>eee</div>
            <div className={is.fff}>fff</div>
        </div>
    );
}

export default ImGo;