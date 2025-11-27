const express = require('express')
const cors = require('cors')

const app = express()

//cors 적용
app.use(
    cors({
        origin:"http://localhost:8888",
        credentials:true
    })
)

app.get('/',(req,res)=>{
    res.send('get 실행')
})


app.listen(80,()=>{
    console.log('express 80 서버 실행')
})