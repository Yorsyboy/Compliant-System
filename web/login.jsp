<%-- 
    Document   : login
    Created on : May 4, 2021, 9:11:04 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
        <style>
            
            @media only screen and (max-width: 767px){
                .design {
                    background-image: url(image2.jpeg);
                }
            }
        </style>
    </head>
    <body data-spy="scroll" data-target=".navbar" style="background-image: url(image2.jpeg);background-size: cover;background-repeat: no-repeat;background-position: center;background-attachment: fixed;min-height: 100%">
        <nav class="navbar navbar-inverse navbar-fixed-top" >
            <div class="container">
		<div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        		<span class="icon-bar"></span>
       			<span class="icon-bar"></span>
        		<span class="icon-bar"></span> 
                    </button>
                        <span class="navbar-text white-text" id="New" style="font-size: 30px;color: white;">Complaint Management System</span>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
			<li><a href="adminlogin.jsp">Admin Login</a></li>
                    </ul>
		</div>
            </div>
        </nav>
        
        <div class="container" style="padding-top: 100px;">
            <div class="col-md-6" style="float: right;">
                <div class="panel panel-default">
                    <div class="panel-heading" style="text-align: center; background-color: #0d47a1;">
                        <h3 style="color: white;"><strong> Student Login</strong></h3>
                    </div>

                    <div class="panel-body panel-height" style="background-color: #eeeeee; height: 300px;">
                        <form action="StudentLogin" method="GET" class="form-horizontal" data-toggle="validator" role="form" >
                            <div class="form-group">
                                <label for="inputName" class="control-label col-md-1"><h4><strong> Name</strong></h4></label>
                                <div class="col-md-12"><input type="text" class="form-control" id="inputName" name="stu" placeholder="student name" required></div>
                            </div>
                                
                            <div class="form-group">
                                <label for="inputPassword" class="control-label col-md-1"><h4><strong>Password</strong></h4></label>
                                <div class="col-md-12"><input type="Password" class="form-control" id="inputPassword" name="pass" placeholder="password" required></div>
                            </div>
                            
                            <div class="form-group">
                                <div class="control-label col-md-7"><a href="forgotpass.jsp">Forgot Password</a></div>
                            </div>
                            
                            <button type="submit"  class="btn btn-success col-md-5" style="background-color: #0d47a1; ">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        

            <footer class="navbar navbar-default navbar-fixed-bottom">
                <div class="container">
  		<p class="text-center" style="padding: 10px">@ 2021 Copyright: Yorsyboy</p>
                </div>
            </footer>
    </body>
</html>
