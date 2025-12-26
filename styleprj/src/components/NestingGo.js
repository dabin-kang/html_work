import React from 'react';
import ns from'../styles/nest.module.scss'

function NestingGo(props) {
    return (
        <div>
            <h1>NestingGo</h1>
            <section>section입니다
                <div>div1입니다</div>
            </section>
            <div>div2입니다</div>

            <div className={ns.aaa}>
                aaa입니다
                <span>span입니다</span>
                <div className={ns.bbb}>bbb입니다</div>
                <div className={ns.ccc}>ccc입니다</div>
            </div>

            {/* className={`${ns.aaa} ${ns.ccc}`} aaa 이면서 ccc 인것 */}
            <div className={`${ns.aaa} ${ns.ccc}`}>aaa ccc입니다</div>
            <div className={`${ns.ddd} `}>ddd입니다
                <div className={ns.fff}>ddd{'>'}fff</div>
            </div>
            <div className={`${ns.eee} `}>eee</div>
            <div className={`${ns.fff} `}>fff</div>
            <div className={`${ns.dddggg} `}>dddggg</div>
        </div>
    );
}

export default NestingGo;