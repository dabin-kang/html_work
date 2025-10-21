let c ='로이'
function fn_1(req,res){
    console.log(`01_mod.js fn_1 실행`)
    //res.send(`01_mod.js fn_1 ${c} ${me}`)
    res.send(`01_mod.js fn_1 ${c}`)
}



function view(req,res){
    console.log(`01_mod.js fn_1 실행,req.cllkie`)
    //res.send(`01_mod.js fn_1 ${c} ${me}`)
    console.log(req.cookies);
    res.send(`01_mod.쿠키보기1 ${JSON.stringify (req.cookies)},${req.cookies.pname}`)
}


function modify(req,res){
    //5초 이후 삭제
    res.cookie('pid','aaa',{maxAge:5000})
    console.log(`01_mod.js fn_1 실행,req.cllkies`)
    //res.send(`01_mod.js fn_1 ${c} ${me}`)
    res.send(`01_mod.쿠키보기1 ${JSON.stringify(req.cookies)},${req.cookies.pname}`)
}

module.exports ={
    c,
    fn_1,
    view,
    modify
}