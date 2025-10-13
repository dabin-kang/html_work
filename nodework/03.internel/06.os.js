const os = require('os')
//console.log(os)
console.log(`arch() : ${os.arch()}`)
console.log(`platform() : ${os.platform()}`)
console.log(`type() : ${os.type()}`)
console.log(`uptime() : ${os.uptime()}`)
console.log(`hostname() : ${os.hostname()}`)
console.log(`release() : ${os.release()}`)
console.log(`homedir() : ${os.homedir()}`)      //홈 디렉토리(사용자계정 홈)
console.log(`tmpdir() : ${os.tmpdir()}`)        //임시파일 저장 경로
console.log(`cpus() : `, os.cpus())             //cpu코어 정보
console.log(`freemem() : `, os.freemem())       //사용가능 메모리
console.log(`totalmem() : `, os.totalmem())     //전체 메모리