const { isMainThread, Worker } = require('worker_threads')
console.log(`main->isMainThread : ${isMainThread}`)

//워커생성
const wk1 = new Worker('./12.worker.js', {
    workerData: { pname: '장동건', age: 53 }  // 워커 생성시 초기화 정보 : 최초 1회만 가능
})

const wk2 = new Worker('./12.worker.js', {
    workerData: { pname: '정우성', age: 48 }  // 워커 생성시 초기화 정보
})

const wk3 = new Worker('./12.worker.js', {
    workerData: { pname: '원빈', age: 38 }  // 워커 생성시 초기화 정보
})

wk1.postMessage('wk1 잘지내지?')  //main -> wk1 으로 메세지 전송



wk1.on('message', (msg) => {
    console.log(`${workerData.pname}:`, msg)
})


//에러발생시 수신
wk1.on('error', (e) => {
    console.log(`main 에러확인(wk1):`, e.message)
})
wk2.on('error', (e) => {
    console.log(`main 에러확인(wk2):`, e.message)
})



//worker 종료시 수신
wk2.on('exit', (e) => { // e : 정상종료(e), 비정상혹은 에러종료(1)
    console.log(`main 종료확인(wk2):`, e)
})


setTimeout(() => {
    wk3.terminate()  //main에서 worker 종료(비정상 종료)
}, 2000);
