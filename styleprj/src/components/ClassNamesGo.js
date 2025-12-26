import cl from '../styles/classnames.module.scss'
import classNames from 'classnames'

function ClassNamesGo(props) {
    const ca = `${cl.aaa}`
    return (
        <div>
            <h1>ClassNamesGo</h1>
            <div className={cl.aaa}>aaa</div>
            <div className={cl.bbb}>bbb</div>
            <div className={cl.ccc}>ccc</div>
            <div className={`${cl.aaa} ${cl.bbb}`}>aaa+bbb1</div>

            {/* 문자열 여러개를 결합 */}
            <div className={classNames(`${cl.aaa}`, `${cl.bbb}`)}>aaa+bbb2</div>

            {/* 문자열 과 배열을결합 */}
            <div className={classNames([`${cl.aaa}`, `${cl.bbb}`],`${cl.ccc}`)}>aaa+bbb2</div>

            {/* 변수 */}
            <div className={classNames(ca)}>aaa변수</div>

            {/* 변수 더하기 조건 */}
            <div className={classNames({[ca]:true})}>aaa변수+조건 true</div>
            <div className={classNames({[ca]:false})}>aaa변수+조건 false</div>
        </div>
    );
}

export default ClassNamesGo;