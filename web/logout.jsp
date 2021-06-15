<%-- 
    Document   : logout
    Created on : Jun 8, 2021, 10:53:06 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
    </head>
    <body data-spy="scroll" data-target=".navbar" style="background-color: #e0e0e0;">
        
        <%
            response.sendRedirect("login.jsp");
        %>
        
        <nav class="navbar navbar-inverse  navbar-fixed-top" >
            <div class="container">
		<div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
       			<span class="icon-bar"></span>
        		<span class="icon-bar"></span> 
                    </button>
			<span class="navbar-text white-text" id="New" style="font-size: 30px">Complaint Management System</span>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
                        <li><a >Logout</a></li>
                    </ul>
                </div>	
            </div>
        </nav>
    </body>
</html>
