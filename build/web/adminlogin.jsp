<%-- 
    Document   : adminlogin
    Created on : May 4, 2021, 11:11:56 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
    </head>
    <body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
        <nav class="navbar navbar-inverse  navbar-fixed-top" >
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
                    <li><a href="index.jsp">Home</a></li>
                </ul>	
            </div>	
            </div>
        </nav>
        
        <div class="container" style="padding-top: 100px; float: left;">
            <div class="col-md-10"> 
              <div class="col-md-offset-3 col-md-10">
                <h2><strong>Admin Login</strong> </h2><br>
              </div>

            <form action="AdminLogin" method="get" class="form-horizontal control-form col-md-12"data-toggle="validator" role="form">
                <div class="form-group">
                    <label for="inputName" class="control-label col-md-5"> Admin ID:</label>
                    <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="username" required ></div>
                </div>

                <div class="form-group">
                    <label for="intputPassword" class="control-label col-md-5"> Admin Password:</label>
                    <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="password" required ></div>
                </div>
                
                

                <div class="form-group">
                    <div class="col-md-offset-5 col-md-10">
<!--                        <button type="submit" class="btn btn-success col-md-3" style="background-color: #0d47a1;">Submit</button>-->
                        <input name="submit" id="login" class="btn btn-success col-md-3" style="background-color: #0d47a1;" type="submit" value="Login"/>
                    </div>
                </div>

            </form> 
            </div>  
        </div>
    </body>
</html>
