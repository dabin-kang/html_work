console.log('dynamic2 시작--------')

if(true){
   // import{aa,bb} from './sub33.mjs' - 에러발생
   // await import{aa,bb} from './sub33.mjs' 
    console.log(aa,bb)

    var sub33 = await import('sub33.mjs')

    if(false){
        var sub33 = await import('./sub44.mjs')
    }
    console.log(sub33.aa,sub33.bb)
}




//let sub33 = import(./sub33.mjs)
//console.log(sub33.aa,sub33.bb)

let sub33 = await import('./sub33.mjs')
console.log(sub33.aa,sub33.bb)

tt = './sub55.mjs'
//import {cc,dd} from tt
//console.log(cc,dd)


let sub55 =  await import(tt)
console.log(sub55.cc,sub55.dd)


console.log('dynamic2 끝--------')
