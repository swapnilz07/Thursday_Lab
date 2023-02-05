<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <%@page import="java.beans.Statement"%>  
  <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.io.IOException"%>
  <%@page import="java.sql.Connection"%> 
  <%@page import="java.sql.PreparedStatement" %> 
    
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
<form action="" method="">
<label>Enter Employee Id To See The Data of that Employee :.</label>
<br/><br/>
<input type="number" placeholder="Enter Employee ID" name="Id" />
<br/>
<input type="submit" value="Click here" />
<input type="reset" value="reset" />
</form>
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
	String q="select * from emp_table where emp_id=?";
String emp_id;
emp_id=request.getParameter("Id");
int i=Integer.parseInt(emp_id);
	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
PreparedStatement st=con.prepareStatement(q);
st.setString(1, emp_id) ;
ResultSet rs=st.executeQuery();
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