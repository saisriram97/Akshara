<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>Add Student Details</h1>
<form action=AdminController method=post>
<table align=center>
<tr><td>Enter Name of student:</td><td><input type=text name=StudentName></td></tr>
<tr><td>Enter Roll no:</td><td><input type=text name=RollNo></td></tr>
<tr><td>Enter Father's name:</td><td><input type=text name=FName></td></tr>
<tr><td>Enter Mother's name:</td><td><input type=text name=MName></td></tr>
<tr><td>Enter Aadhar no:</td><td><input type=text name=Ano></td></tr>
<tr><td>Enter Mobile no:</td><td><input type=text name=Mno></td></tr>
<tr><td>Enter Class:</td><td><input type=text name=Cla></td></tr>
<tr><td>Enter Caste:</td><td><input type=text name=Caste></td></tr>
<tr><td></td><td><input type=submit value=AddStudentDetails name="evmButton"></td></tr>
</table>
</form>
</body>
</html>