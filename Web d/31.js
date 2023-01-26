const http=require("http");
const fs=require('fs');
const filecontent=fs.readFileSync('23.html');
const server=http.createServer((req,res)=>{
    res.writeHead(200,{'content-type':'text/html'});
    res.end(filecontent);
})
server.listen(80,'127.0.0.1',()=>{
    console.log('listenint port 80');
})

//if we use 80 in server listen then on chrome write only 127.0.0.1 otherwise if let we use 8000 then write 127.0.0.1.8000