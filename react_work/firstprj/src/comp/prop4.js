import PropFunc from './prop/propfunc'

function gggr(){
    return<>
        <h1>함수형  props 입니다</h1>
        <PropFunc pname='박보검' age={33} marriage = {true}/>
        <PropFunc pname='박보건'  marriage = {false}/>
        <PropFunc pname='박보술' age={33} />
        <PropFunc age={33} marriage = {false}/>
    </>
}

export default gggr