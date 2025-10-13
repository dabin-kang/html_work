function fn_1(){
    console.log('fn_1()실행')
    fn_2()
    console.log('fn_1()끝')
}
function fn_2(){
    console.log('fn_2()실행')
    fn_3()
    console.log('fn_2()끝')
}
function fn_3(){
    console.log('fn_3()실행')
    console.log('fn_3()끝')
}

fn_1()