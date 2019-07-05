<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Akshara School</title>
</head>
<body bgcolor="#E6E6FA">
<h1 align="center">AKSHARA ADMIN</h1>
<h1 align="center">Login Page</h1>
<form action="LoginController" method="post">

	<table align="center">
	<tr><td>UserName</td>
		<td><input type="text" name="username" required></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" required></td>
	</tr>
    
				</table>
				
				<p align="center">
			<input type="submit" value="Submit" />
			<% if(session.getAttribute("login_result")!=null)
					out.println(session.getAttribute("login_result")); %>
			</p>

			
			</form>
			
			 
			

</body>
</html>