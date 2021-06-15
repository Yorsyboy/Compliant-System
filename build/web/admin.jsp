<%-- 
    Document   : admin
    Created on : May 6, 2021, 9:58:27 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackages.AdminLogin" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin</title>
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
            <h1 style="text-align: center">Welcome, ${adminlogged}</h1>
            <div  style="float: left;">
		<ul class=" nav nav-pills nav-stacked flex-column">
                    <li><a href="regstudent.jsp">Register New Student </a></li>
                        <li><a href="allcomplaint.jsp">All Complains</a></li
                </ul>
	</div>
           
        </div>
    </body>
</html>
