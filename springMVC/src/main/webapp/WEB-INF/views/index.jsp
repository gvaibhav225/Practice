<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            background: url(https://images.pexels.com/photos/28054/pexels-photo-28054.jpg) ;
            background-repeat: no-repeat;
            background-size: cover;

        }
        .left{
            position: absolute;
            top: 10px;
            left: 10px;

        }
        .navbar{
            
            background-color: rgb(6, 6, 6);
            box-shadow: 2px 3px red;
        }
        li{
            float: left;
            margin: 10px 10px;
            list-style: none;
           
        }
        li a{
            text-decoration: none;
            color: rgb(251, 248, 248);
            font-size: 18px;
            
        }
        li a:hover{
            color: red;

        }
        .mid{
           display: flex;
            text-align: center;
            align-items: center;
            margin: 20px auto;
        }
        .navbar{
          
            width: 350px;
            margin:  auto;
           
            
        }
        .right{
            position: absolute;
            top: 10px;
            right: 10px;
        }
        ul{
            overflow: auto;
        }
        .box{
            border: 2px solid white;
            width: 400px;
            height: 398px;
            margin: 46px 127px;
            border-radius: 20px;
            text-align: center;
            color: rgb(8, 8, 8);
            background-color: rgb(235, 234, 225);
            box-shadow: -2px -2px red;
        }
        .box input{
            margin: 15px 30px;
            font-size: large;
            text-align: center;
            border-radius: 23px;
            color: black;

        }
        .submit, .reset{
            width: 100px;
            text-align: center;
        }
        .submit:hover,.reset:hover{
            color: red;
            background-color: dimgray;
        }


    </style>
</head>
<body>
    <div class="left">
   <img src="https://i.pinimg.com/564x/6a/87/b0/6a87b06ee4f2c9ff739f1a4eaa901785.jpg" width="60px" height="60px" alt="">
    </div>
    <div class="mid">
        <nav class="navbar">
            <ul>
                <li><a href="/springMVC/home">Home</a></li>
                        <li><a href="">Contact</a></li>
                        <li><a href="">About</a></li>
                        <li><a href="">Services</a></li>
    
            </ul>
        </nav> 
    </div>
    <div class="right">
        <button>Email us</button>
    </div>
    <div class="box">
        <h1>Join the best gym now</h1>
        <form action="backend.java" method="post">
            <input type="text" name="myname" placeholder="write your name">
            <input type="text" name="mygender" placeholder="write your gender">
            <input type="text" name="myage" placeholder="write your age">
            <input type="text" name="mycontact" placeholder="write your contact no.">
            <input type="submit" class="submit">
            <input type="reset" class="reset">
        </form>


    </div>
</body>
</html>