import fs from'../styles/for.module.scss'

function ForGo(props) {
    return (
        <div>
            <h1>ForGo</h1>
            <h1>through</h1>
            <div className={fs.aaa}>aaa1</div>
            <div className={fs.aaa}>aaa2</div>
            <div className={fs.aaa}>aaa3</div>
            <br/>
            <div>
            <div className={fs.bbb}>bbb1</div>
            <div className={fs.bbb}>bbb2</div>
            <div className={fs.bbb}>bbb3</div>
            </div>

            <h2>인덱스배열- each</h2>
            <div>
            <div className={fs.ccc}>ccc1</div>
            <div className={fs.ccc}>ccc2</div>
            <div className={fs.ccc}>ccc3</div>
            <div className={fs.ccc}>ccc4</div>
            </div>

            <h2>키배열</h2>
            <div className={fs.qq}>qq</div>
            <div className={fs.ee}>ee</div>
            <div className={fs.rr}>rr</div>

            <h2>배열행렬</h2>
            <div className={fs.tt}>tt</div>
            <div className={fs.yy}>yy</div>
            <div className={fs.uu}>uu</div>
            
            <h2>While</h2>
            <div className={fs.ddd_10}>ddd_10</div>
            <div className={fs.ddd_30}>ddd_30</div>
            <div className={fs.ddd_50}>ddd_50</div>
            <div className={fs.ddd_70}>ddd_70</div>
            <div className={fs.ddd_90}>ddd_90</div>
        </div>
    );
}

export default ForGo;