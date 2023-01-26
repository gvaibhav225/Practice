//inoder to use sweetalert go to website and add their script link in html
// swal("Hello world!");

function area(a,b,c){
    avg=(a+b+c)/2;
  var are=Math.sqrt((avg*(avg-a)*(avg-b)*(avg-b)));
    return are;
}

var ab=area(5,6,7);
console.log(ab)
document.getElementById('para').innerHTML=ab;

function leap(){
var year=parseInt(document.getElementById('year').value);
if(year%4==0){
  
    document.getElementById('boolean').innerHTML=true
}
else 
document.getElementById('boolean').innerHTML=false}

// today=new Date();
// console.log(today.getMonth)
// var christmasyear=today.getFullYear
// if((today.getMonth==12&&today.getDate>25)){
//     christmasyear=christmasyear+1;
// }
// var christmas=new Date(christmasyear,12,25);
// var oneday=(1000*60*60*24);
// var days=Math.ceil((christmas.getTime()-today.getTime())/(oneday));

// document.getElementById('days').innerHTML=days

 s="vaibhav"
if(s==s.toLowerCase()){
    console.log("true")
}
else{
console.log("false")
}
let c=0;
for(element of s){
if(element=='a'||element=='e'||element=='i'||element=='o'||element=='u'){
c++;
}
}
console.log(c)

if(typeof s== "string"){
    console.log("true")
}
else{
console.log("false")
}



//ways to add in set
const fruits=new Set(["mango","orange","banana"])

const vehicle=new Set();
vehicle.add("car")
vehicle.add("bus")
vehicle.add("car")   //set will do show another car , cant add same thing again
console.log(vehicle.size)

for(element of vehicle){
    console.log(element)  
}



//inheritance
class Fruit{
    constructor(name){
        this.name=name;
    }
     print(){
        return "yoyo"+this.name;
    }
}
class Features extends Fruit{
    constructor(name,price){
        super(name)
        this.price=price
        
    }

    displayy(){
        return this.print()+"arere"+this.price
    }

    static abc(){
        return "static";
    }

}
let obj=new Features("mango",1000)
console.log(obj.displayy())
console.log(Features.abc())  //we cant write obj.abc() in static , have to use class name and not forget to use () on these



//arrow functions as lambda function

abc=()=>{return "this"}
console.log(abc())

abcd=()=>"directly can write like this also"
console.log(abcd())

e=(a,b)=>a+b+abc()
console.log(e(4,6))

//form validations

//for phone use regex ^\d{10}$
function validate(){
    let x=document.forms["myform"]["fname"].value
    if(x==""){
        alert("enter something")

        return false
    }
    
    swal({
        title: "Good job!",
        text: "You clicked the button!",
        icon: "success",
      });
      return true


}

