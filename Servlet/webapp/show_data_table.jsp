<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.io.IOException"%>
  <%@page import="java.sql.Connection"%>  
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, td {
  border: 1px solid black;
  border-collapse: collapse;
   padding:7px;
}
table.center {
  margin-left: auto;
  margin-right: auto;
  margin-top:50px;	
}
</style>
</head>
<body>
<h1 style='text-align:center; background-color:green' >Employee Data Table</h1>
<table  class="center" style="width:600px">
<tr>
<td>Employee Id</td>
<td>First Name</td>
<td>Last Name</td>
<td>Gmail</td>
<td>Department</td>
<td>Designation</td>
</tr>

<%
try 
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
java.sql.Statement st=con.createStatement();
ResultSet rs=((java.sql.Statement) st).executeQuery("select * from emp_table");
while(rs.next()){
%>
<tr>
<td><%=rs.getString("emp_id") %></td>
<td><%=rs.getString("first_name") %></td>
<td><%=rs.getString("last_name") %></td>
<td><%=rs.getString("emp_email") %></td>
<td><%=rs.getString("emp_department") %></td>
<td><%=rs.getString("emp_designation") %></td>
</tr>
<%
}
con.close();
}
catch (Exception e) 
{
   e.printStackTrace();
}
%>
</table>
</body>
</html>