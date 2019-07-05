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
  <input type = "text" name = "rollNumber2">
  <input type="submit" value = "getRollDelete" name="evmButton">
  
  </form>
  </div>
 <form action="AdminController" method="post" align="center">
<table ALIGN="center" border="1px" cellpadding="5">
   <tr><td>ROLL NO</td>
  <td>NAME</td>
  <td>FATHERS NAME</td>
  <td>MOTHERS NAME</td>
  <td>AADHAR NO</td>
  <td>MOBILE NO</td>
  <td>CLASS</td>
  <td>CASTE</td>
  </tr>
  
<%  ArrayList<StudentBean> List = (ArrayList)request.getAttribute("studentlistdelete");
if(List!=null){
Iterator<StudentBean> it=List.iterator();
while(it.hasNext())  
{
	StudentBean pb = it.next(); 

%>

<tr>
<td><%=pb.getRollNo()%></td>
<td><%=pb.getStudentName()%></td>

<td><%=pb.getFatherName()%></td>
<td><%=pb.getMotherName()%></td>
<td><%=pb.getAadharNo()%></td>
<td><%=pb.getMobileNo()%></td>
<td><%=pb.getClassName()%></td>
<td><%=pb.getCaste()%></td>
</tr>
<input type =hidden value=<%=pb.getRollNo()%> name=haha>
<%

}

}
%>

 </table>
  <input type="submit" value = "Delete" name="evmButton">
  </form>
</body>
</html>