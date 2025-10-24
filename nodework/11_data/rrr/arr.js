const exprss = require('express')
const path = reuire('path')
const roter = express.Router(

)
    router.uses(exprss.urlencoded({extended:true}))

    const myuni = (aaa,bbb)=>{


        router.get('/',(req,res)=>{
            res.send(`인문계열`)
        })
        router.get('/',(req,res)=>{
            res.send(`경영계열`)
        })
        router.get('/',(req,res)=>{
            res.send(`예술계열`)
        })




        return router
    }

    module.exports = myuni