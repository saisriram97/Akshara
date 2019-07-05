<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.util.ArrayList,
                 com.akshara.bean.StudentBean"%>
  <%@page import="java.util.Iterator"%> 
  
  <div align="left">
  
  <form action="AdminController" method="post">
  <select name="evmButton">
  <option value="lkg">LKG</option>
  <option value="ukg">UKG</option>
  <option value="first">1st class</option>
  <option value="second">2nd class</option>
  <option value="third">3rd class</option>
  <option value="fourth">4th class</option>
  <option value="fifth">5th class</option>
  <option value="sixth">6th class</option>
  <option value="seventh">7th class</option>
  <option value="eight">8th class</option>
  <option value="ninth">9th class</option>
  <option value="tenth">10th class</option>
  </select>
  <input type="submit" value = "GET_DETAILS" name="evmButton">

  </form>
  </div>
  <table ALIGN="center" border="1px" cellpadding="5">
  <tr><td>ROLL NO</td>
  <td>NAME</td>
  <td>FATHERS NAME</td>
  <td>MOTHERS NAME</td>
  <td>AADHAR NO</td>
  <td>MOBILE NO</td>
  <td>CLASS</td>
  <td>CASTE</td>
  
<%  ArrayList<StudentBean> List = (ArrayList)request.getAttribute("studentlist");
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

<%
}

%> </table>
<a align="right" href="AdminHome.jsp">Home</a>
</body>
</html>