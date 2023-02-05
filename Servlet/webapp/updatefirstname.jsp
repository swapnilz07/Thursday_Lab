<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style='text-align:center; background-color:green'>Update Your Employee First Name</h1>
<br/><br/>
<p>To See the table click on below button</p>
<a href="show_data_table.jsp"><button>Show Table</button></a>
<br/><br/>
<form action="changefirstname" method="post" >
<label>Enter Employee Id</label>
<input type="number" placeholder="Enter Employee ID" name="Id" />
<br/>
<label>Enter Employees First name</label>
<input type="text" placeholder="Enter First Name" name="firstname" />
<br/>
<input type="submit" value="Click here" />
<input type="reset" value="reset" />

</form>
</body>
</html>