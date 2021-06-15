<%-- 
    Document   : complaintRegister
    Created on : May 5, 2021, 12:38:52 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackages.StudentLogin" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complaint Register</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
        <style>
            p {
                color: green;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse  navbar-fixed-top" >
            <div class="container">
		<div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        		<span class="icon-bar"></span>
       			<span class="icon-bar"></span>
        		<span class="icon-bar"></span> 
                    </button>
                        <span class="navbar-text white-text" id="New" style="font-size: 30px ;color: white;">Complaint Management System</span>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
                        <li><a href="logout.jsp">Logout</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
                        <li><a href="check_status.jsp">CheckStatus</a></li>
                    </ul>
                </div>	
            </div>
        </nav>
            
        <div class="container" style="padding-top: 100px; float: left;">
            <div class="col-md-10"> 
                <div class="col-md-offset-3 col-md-10">
                    <h1 style="text-align: center"><strong>Welcome, ${stulogged}</strong></h1>
                    <h2><strong>Let Us Know Your  Complaints</strong> </h2><br>
                </div>
   
                    <%
                String success = (String)request.getAttribute("success");
                    if(success != null)
                    out.println("<p>" + success + "</p>");
                %>
                    
                    
        <form action="Complaint" method="post" class="form-horizontal control-form col-md-12" data-toggle="validator" role="form">
            <div class="form-group">
                <label for="Confrim Password" class="control-label col-md-5">Complaint type:</label>
                    <div class="col-md-6">
                        <select class="form-control" name="type" required  >
                        <option value="">Select Complaint type</option>
                        <option>FAST TRACK</option>
                        <option>NORMAL</option>
                        </select>
                        <div class="help-block">Only MMS Student complaint is Under Fast Track Categories.</div>
                    </div>
            </div>        

            <div class="form-group">
                <label for="inputName" class="control-label col-md-5"> Contact Number:</label>
                    <div class="col-md-6">
                        <div class="input-group">
                            <span class="input-group-addon" id="sizing-addon1">+234</span>
                            <input  id="inputName" type="text" class="form-control" name="number" placeholder="A Valid Contact Number" required  >
                        </div>
                    </div>
            </div>
  
            <div class="form-group">
              <label for="inputName" class="control-label col-md-5"> Student Name:</label>
                <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="name" placeholder="Student Name" required  ></div>
            </div>
    
            <div class="form-group">
                <label for="Confrim Password" class="control-label col-md-5">Department:</label>
             <div class="col-md-6">
                <select class="form-control" name="dep" required  >
                    <option value="">Select Department</option>
                    <option>JAVA</option>
                    <option>PYTHON</option>
                    <option>C#</option>
                    <option>CCNA</option>
                    <option>ANGULAR</option>
                    <option>JAVASCRIPT</option>
                    <option>MMS</option>
                </select> 
              </div>
            </div>

        <div class="form-group">
          <label for="inputName" class="control-label col-md-5"> Problem Subject:</label>
          <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="prob" placeholder="Problem Subject" required  >
          </div>
        </div>

        <div class="form-group">
            <label for="inputName" class="control-label col-md-5"> Complaint:</label>
            <textarea  id="inputName"  class="form-control" rows="10" name="msg" placeholder="Write your message here..." required></textarea>
        </div>
      
        <p style="margin-left:500px; "  id="demo"></p>
        
        <div class="form-group">
          <div class="col-md-offset-5 col-md-10">
                <button type="submit" class="btn btn-success col-md-3" style="background-color: #0d47a1; ">Submit</button>
          </div>
        </div>
                                                
    </form>
    </div>  
  </div>
    </body>
</html>
