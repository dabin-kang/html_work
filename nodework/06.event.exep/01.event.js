// 이벤트를 등록하고 발생시킬 수 있게 하는 클래스
//node.js 내장모듈 events를 불러오기
const EventEmitter = require('events')

//console.log(EventEmitter)
//이벤트 객체 생성
const myE = new EventEmitter()
//console.log(myE)

//이벤트 생성
myE.on ('ev1',()=>{
    console.log('ev1 실행')
})

myE.on ('ev1',()=>{
    console.log('ev1 실행')
})


console.log(`listenerCount('en1):`,myE.listenerCount('ev1')) // ev1 호출에 실행되는 이벤트 갯수

console.log('_eventsCount:',myE._eventsCount) // 이벤트 갯수


// on ==  addListener
myE.addListener ('ev1',()=>{
    console.log('ev1 실행3')
})




// once = 최초 호출시에만 실행
myE.ones ('ev1',()=>{
    console.log('ev1 실행3')
})

myE.ones ('ev2',()=>{
    console.log('ev2 실행3')
})


myE.emit('ev1') // 이벤트 호출
myE.emit('ev1') // 이벤트 호출
myE.emit('ev1') // 이벤트 호출

console.log(`listenerCount('en1):`,myE.listenerCount('ev1')) // ev1 호출에 실행되는 이벤트 갯수 - once는 제외
console.log(`listenerCount('en1):`,myE.listenerCount('ev1')) // ev1 호출에 실행되는 이벤트 갯수