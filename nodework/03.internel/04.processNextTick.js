console.log('main 실행 1')
setTimeout(()=>console.log('Timeout실행'),0)
setImmediate(()=>console.log('Immediate실행'))
process.nextTick(()=>console.log('nextTick 실행1'))
Promise.resolve().then(()=>console.log('promise 실행2'))
Promise.resolve().then(()=>console.log('promise 실행3'))
process.nextTick(()=>console.log('nextTick 실행4'))

console.log('main 실행 2')