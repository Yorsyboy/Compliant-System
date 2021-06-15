<%-- 
    Document   : regstudent
    Created on : May 6, 2021, 10:31:39 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackages.AdminLogin" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Registration</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
    </head>
    <body data-spy="scroll" data-target=".navbar" style="background-color: white;">
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
<!--                    <li><a href="index.jsp">Home</a></li>-->
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>	
            </div>	
            </div>
        </nav>
        
        
        <div class="container" style="padding-top: 100px; float: left;">
            <div  style="float: left;">
		<ul class=" nav nav-pills nav-stacked flex-column">
                    <li><a href="regstudent.jsp">Register New Student </a></li>
                        <li><a href="allcomplaint.jsp">All Complains</a></li>
                </ul>
            </div>
            <div class="col-md-9" style="float:right;">
                <h1 style="text-align: center">Welcome, ${adminlogged}</h1>
      		<div class="col-md-9">
   		   <h2 style="float: right;"><strong>Add New User</strong> </h2><br>
            </div>

            <form class="form-horizontal" action="AddStudent" method="post"data-toggle="validator" role="form">
                <div class="form-group ">
                    <label for="inputName" class="control-label col-md-5">Student Name:</label>
			<div class="col-md-5"><input  id="inputName" type="text" class="form-control" name="student_id" required ></div>
		</div>

		<div class="form-group">
                    <label for="inputPassword" class="control-label col-md-5">Password:</label>
			<div class="col-md-5"><input  id="inputPassword" type="Password" class="form-control" name="pass" required></div>
                </div>
                
                <div class="form-group">
                    <label for="intputPassword" class="control-label col-md-5"> Questions:</label>
                        <div class="col-md-5">
                            <select class="form-control" name="question" required >
                                        <option value="">Select Question</option>    
                                        <option>What is your mother tonuge</option>
                                        <option>What is you pet name</option>
                                        <option>Your frist school name</option>
                                        <option>Your favourite colour </option>
                            </select> 
                        </div>
                </div>

                <div class="form-group">
                    <label for="intputPassword" class="control-label col-md-5"> Your Answer:</label>
                        <div class="col-md-5"><input  id="Password" type="" class="form-control" name="answer" required></div>
                </div>
                
                <div class="form-group">
                    <div class="col-md-offset-5 col-md-10">
                        <button type="submit" class="btn btn-success col-md-3" style="background-color: #0d47a1; ">Submit</button></div>
		</div> 
			         
            </form>
        </div>
        </div>
    </body>
</html>
