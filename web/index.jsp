<%-- 
    Document   : index.jsp
    Created on : May 4, 2021, 8:38:04 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
	<link rel="stylesheet" href="bootstrap.css">
        <script  src="jquery.js"></script>
        <script  src="bootstrap.js"></script> 

        
    
        
        
        <style>
		section{
			width: 100vw;
			height: 100vh;
			padding: 50Px;
		}
		.cl_white{
			color: white;
		}
		img {
			width: 300px;
			transtion:opacity 1s ease-in-out; 
		}
		img:hover {
			opacity: .5;
		}
		.col-text{
			-webkit-column-count:3;
		}

	</style>
    </head>
    <body data-spy="scroll" data-target=".navbar">
        <nav class="navbar navbar-inverse  navbar-fixed-top">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        	<span class="icon-bar"></span>
       		<span class="icon-bar"></span>
        	<span class="icon-bar"></span> 
            </button>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav" >
                    <li><a href="#home">Home</a></li>
                    <li><a href="#about">About Me</a></li>
                    <li><a href="#contact">Contact Me</a></li>
                </ul>		
            </div>
	</nav>
        
        <div>
            <section id="home" style="background: url(image1.jpeg ); background-size: 100% 100%" class="cl_white text-center"> 
                <h1 style="font-size: 70px;"><STRONG>Complaint Management System.</STRONG></h1>
		<p class="lead"><strong>To Write Complaint Click On Proceed Button!</strong> </p>
		<a href="login.jsp"><button class="btn btn-default" style="font-size: 30px;">Proceed Here</button></a> 
            </section>
	</div>
        
        <section id="about" class="clean-block about-us">
           
            <h1 class="text-center" style=""><STRONG>About Me!</STRONG> </h1>
                <div class="col-sm-6 col-lg-4">
                        <div class="card clean-card text-center"><img class="card-img-top w-100 d-block" src="Taiwo.jpeg">
                            <div class="card-body info">
                                <h4 class="card-title">Taiwo Toyosi</h4>
                                <p class="card-text">JAVA Student</p>
                            </div>
                        </div>
                    </div>
                
           
    
		<div class="text-muted card-text">
			I am a student of NIIT.
                        I am pursing a Degree in JAVA programming language in this Institute.
                        This project is a Simple compliant management system for the student of NIIT .
                        This project have been completed under the guidance of Mr. Taofeek (My Faculty).
		</div>
           
	</section>
            
        <br><br><br><br><br>
        <div class="footer">
            <section id="contact" class="" style="background-color: black;">
                <div class="page-header">
                    <h1 class="text-center" style="color: white;"><STRONG>Contact Me!</STRONG> </h1>
                </div>
                <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 item">
<!--                        <h3><STRONG>Contact Me</STRONG></h3>-->
                        <ul style="color: white">
                            <li><a href="#" style="color: white">Email: adekunletaiwo43@yahoo.com</a></li>
                            <li><a href="#" style="color: white">Mobile: 09017222869</a></li>
                        </ul>
                    </div>
                </div>
                    <p class="copyright" style="text-align: center"> © 2021</p>
            </div>	
            </section>
        </div>
    </body>
</html>
