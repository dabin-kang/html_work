import clst from '../styles/classnames.module.scss'
import classNames from 'classnames'
import cnbind from 'classnames/bind'

// cnst ==>import cnbind from 'classnames/bind'로 묶어서 사용
//cnst의 스타일 정의를 문자열로 호출할 수 있다
const cx = cnbind.bind(clst)

function ClassNameBindGo(props) {
    return (
        <div>
            <h1>ClassNameBindGo이다</h1>
            <div className={clst.aaa}>aaa</div>
            <div className={clst.bbb}>bbb</div>

            {/* 문자열 여러개를 결합 */}
            <div className={classNames(`${clst.aaa}`, `${clst.bbb}`)}>aaa+bbb2</div>

            {/* bind를 이용하여 문자열로 스타일 가져오기 */}
            <div className={cx('aaa','bbb')}>aaa+bbb3</div>

            {/* 문자열인 변수 ,props , state 를 사용가능 */}
            <div className={cx('aaa',props.st)}>aaa+ccc</div>


            <div className={cx('aaa',{'bbb':true})}>aaa+'bbb':true</div>
            <div className={cx('aaa',{'bbb':false})}>aaa+'bbb':false</div>
        </div>
    );
}

export default ClassNameBindGo;