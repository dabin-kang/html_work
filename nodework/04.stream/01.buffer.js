let ttt = '나는 꿈을 꾸는 문너'
console.log(`ttt : ${ttt}`)
let buf = Buffer.from(ttt)
console.log(`Buffer.from :`,buf,buf.length)
console.log(`toString.from :`,buf.toString())

let arr = [Buffer.from('qwer'),Buffer.from('파란하늘'),Buffer.from('1234'),Buffer.from('!@#$%')]
console.log(`arr:`,arr)
buf = Buffer.concat(arr)
console.log(`Buffer.concat:`,buf,buf.length)
console.log(`toString.from :`,buf.toString())

buf = Buffer.alloc(5)
console.log(`Buffer.alloc(5):`,buf)
