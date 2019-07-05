<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Akshara</title>
</head>
<body>
<%@ page import="java.util.ArrayList,
                 com.akshara.bean.StudentBean"%>
  <%@page import="java.util.Iterator"%> 
  <div align="left">
  
  <form action="AdminController" method="post">
  <input type = "text" name = "rollNumber">
  <input type="submit" value = "getRoll" name="evmButton">
  
  </form>
  </div>

  
<%if(request.getAttribute("studentlist")!=null) {
ArrayList<StudentBean> List = (ArrayList)request.getAttribute("studentlist");
Iterator<StudentBean> it=List.iterator();
while(it.hasNext())  
{
	StudentBean pb = it.next(); 

%>
 <form action="AdminController" method="post">

 <table align=center>

 <tr><td>Roll No:</td><td><input type=text name=RollNumber value=<%=pb.getRollNo()%> readonly></td></tr>
<tr><td>Enter Name of student:</td><td><input type=text name=StudentName value=<%=pb.getStudentName()%>></td></tr>
<tr><td>Enter Father's name:</td><td><input type=text name=FName value=<%=pb.getFatherName()%>></td></tr>
<tr><td>Enter Mother's name:</td><td><input type=text name=MName value=<%=pb.getMotherName()%>></td></tr>
<tr><td>Enter Aadhar no:</td><td><input type=text name=Ano value=<%=pb.getAadharNo()%>></td></tr>
<tr><td>Enter Mobile no:</td><td><input type=text name=Mno value=<%=pb.getMobileNo()%>></td></tr>
<tr><td>Enter Class:</td><td><input type=text name=Cla value=<%=pb.getClassName()%>></td></tr>
<tr><td>Enter Caste:</td><td><input type=text name=Caste value=<%=pb.getCaste()%>></td></tr>
<tr><td></td><td><input type=submit value=UpdateStudentDetails name="evmButton"></td></tr>
</table>
<tr>
</tr>
</form>
<%
}
}

%> 


</table>
</body>
</html>