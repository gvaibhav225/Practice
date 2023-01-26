const express=require('express');
const path=require('path');
const app= express();
const fs=require('fs');
const port=80;

app.use('/static',express.static('anyfoldername')); //making static 

app.use(express.urlencoded({extended: true}))

// set template engine pug

app.set('view engine','pug');
 //set view directory
app.set('views', path.join(__dirname,'views'));

//our pug demo endpoint
app.get('/demo', (req,res)=>{
    res.render('demo', { title :'hey', message: 'hellothere'})
})
app.get('/demo1',(req,res)=>{

    res.render('demo1')
})



// for backend form submit remember to add app.use express.un... and also add method as post to form z
app.post('/form', (req,res)=>{
    console.log(req.body);
    const name=req.body.name
    const age=req.body.age
    const gender=req.body.gender
    const message=req.body.message
    const output=`${name}, ${age}, ${gender}, ${message} `
    fs.writeFileSync('backendfile.txt', output);
    const params = {'message': 'Your form has been submitted successfully'}
    res.status(200).render('demo.pug', params);
})

app.get('/', (req,res)=>{
    res.send("this is first page");
})

app.get("/about", (req,res)=>{
    res.send("this about page");
})
app.get("/about", (req,res)=>{
    res.status(200).send("this about page");
})
app.get("/services", (req,res)=>{
    res.send("this is service page");
})

app.listen(port, ()=>{
    console.log("the app started")
})

// we try above things in postMan app with writing localhost in get 