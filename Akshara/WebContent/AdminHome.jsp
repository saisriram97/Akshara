<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin_Home</title>
</head>
<body>
<h1 align=center>Admin_Home</h1>
<div>

<table align="center">
<form action="AdminController" method="post">
<tr><td><input type="submit" value="ViewStudentDetails" name="evmButton"></td></tr>
</form>
<form action="AddStudentDetails.jsp" method="post">
<tr><td><input type="submit" value="AddStudentDetails"  name="evmButton"></td></tr>
</form>
<form action="UpdateStudentDetails.jsp" method="post">
<tr><td><input type="submit" value="UpdateStudentDetails"  name="evmButton"></td></tr>
</form>
<form action="DeleteStudentDetails.jsp" method="post">
<tr><td><input type="submit" value="DeleteStudentDetails"  name="evmButton"></td></tr>
</form>
<div align="center">
<% if(session.getAttribute("update_details")!=null){%>

<%=	session.getAttribute("update_details") %>
<% session.setAttribute("update_details","");} %>
</div>
</table>

</body>
</html>