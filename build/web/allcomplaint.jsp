<%--
    Document   : allcomplaint
    Created on : May 6, 2021, 10:01:19 PM
    Author     : Dell
--%>
<%@page import="mypackages.Dao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mypackages.Connectivity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complaints</title>
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
                    <li><a href="admin.jsp">Home</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>	
            </div>	
            </div>
        </nav>
        
        <div class="container" style="padding-top: 100px; float: left;">
           <div  style="float: left;">
            <h4 style="padding-left: 40px;"><strong>categories</strong></h4>
		<ul class=" nav nav-pills nav-stacked flex-column">
<!--			<li><a href="newAdmin.jsp">ADD</a></li>-->
                        <li><a href="allcomplaint.jsp?com=ALL" >ALL</a></li>
                        <li><a href="allcomplaint.jsp?com=FAST TRACK" >FAST TRACK</a></li>
                        <li><a href="allcomplaint.jsp?com=NORMAL" >NORMAL</a></li>
		</ul>
            <br><br><br><br><br>
            </div>
            
            <div class="col-md-9" style="float:right;">
            <div class="col-md-8" style="float:right">
                <h3 style="color:#0d47a1;"><strong>Complaints list</strong></h3> 
            </div>
            <br><br>
            
            <table class="table table-hover" style="float: right;">
                <thead>
			<tr>
                                <th>#</th>
			        <th>Complaint_ID</th>
				<th>Name</th>
                                <th>Number</th>
				
				<th>Dep</th>
                                <th>Prob</th>
                               
				<th>Message</th>
                                <th>Date</th>
                                <th>Type</th>
			</tr>
                </thead>
                <%
                   try{
                       String com= (String)request.getParameter("com");
                       Connectivity con = new Connectivity();
                       Connection cn = Connectivity.getConnection();
                       int n=0;
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       ResultSet rs;
                       
                       if(com.equals("ALL")){
                           String sql = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable order by S_no desc";
                           PreparedStatement ps = cn.prepareStatement(sql);
                           rs = ps.executeQuery();
                       }else if(com.equals("FAST TRACK")) {
                           String sql1 = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable WHERE type = 'FAST TRACK' ";
                           PreparedStatement ps1 = cn.prepareStatement(sql1);
                           rs = ps1.executeQuery();
                       }else {
                           String sql2 = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable WHERE type = 'NORMAL'";
                           PreparedStatement ps2 = cn.prepareStatement(sql2);
                           rs = ps2.executeQuery();
                       }
                       
                       while (rs.next()) {
                           n++;
                           String num = Integer.toString(n);
                           String ComId = (String) rs.getString("Com_id");
                           String Name = (String) rs.getString("name");
                           String Number = (String) rs.getString("number");
                           String Dep = (String) rs.getString("dep");
                           String Prob = (String) rs.getString("prob");
                           String Message = (String) rs.getString("msg");
                           String Date = (String) rs.getString("strDate");
                           String Type = (String) rs.getString("type");
                           
                           %>
                           <tr>
                            <td><strong><%out.print(num);%></strong></td>
                            <td><%out.print(ComId);%></td>
                            <td><%out.print(Name);%></td>
                            <td><%out.print(Number);%></td>
                            <td><%out.print(Dep);%></td>
                            <td><%out.print(Prob);%></td>
                            <td><%out.print(Message);%></td>
                            <td><%out.print(Date);%></td>
                            <td><%out.print(Type);%></td>
                        </tr><%
                       }
                       
                   } catch (Exception e) {}
                    %>
                
                        
            </table>
            
        
        </div>
        
        </div>
    </body>
</html>
