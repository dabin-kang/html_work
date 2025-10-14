 const fs = require('fs')


 fs.readFile('../fff/aaa.text', (err, data) => {
         console.log(data)
     }
 })


 fs.promises.readFile('../fff/aaa/text')
 .then((date)=>{
    console.log(data.toString())
 })

 
 .catch((date)=>{
    console.log(data.toString())
 })

 fs.promises.readFile('../')