const fs = require('fs')


let files = fs.readdirSync('../fff')

//console.log(files)

for (const fName of files) {
    const st = fs.statSync(`../fff/${fName}`)
    let size ='[dir]'
    size = st.size

    console.log(`${fName} : ${size},${st.birthtime}${st.mtime}`)
}