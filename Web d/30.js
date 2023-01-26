// const fs=require("fs");
// let text=fs.readFileSync("fil1.txt","utf-8");
// console.log(text);
// text=text.replace("vaibhav","V");
// fs.writeFileSync("v.txt",text);

// in above one Sync  is for synchronous 
// Node js has two things i) synchronous or blocking : line by line execution    ii) Asynchronous or non-blocking : line by line execution not guranteed , callbacks are used 
// now above thing is done using asynchronous with callback(function after utf8)

const fs=require("fs");
let t1=fs.readFile("fil1.txt","utf-8",(a,b)=>{console.log(a,b)});
console.log("this will print before as it is not synchronous");

//here a, b are error and data,  so first comes null as error in output then data