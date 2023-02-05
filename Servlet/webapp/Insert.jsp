<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style='text-align:center; background-color:green' >Enter Your Employee Details In The Below form</h1>

<form action="ins_demo" method="post" >
<label>Employee Id</label>
<input type="text" placeholder="Enter Your Employee Id here." name="emp_id" />
<br/><br/>
<label>First Name</label>
<input type="text" placeholder="Enter Your First Name." name="fnaem"/>
<br/><br/>
<label>Last name</label>
<input type="text" placeholder="Enter Your Last Name" name="lname"/>
<br/><br/>
<label>Gmail</label>
<input type="text" placeholder="Enter Your Gmail" name="gmail"/>
<br/><br/>
<label>Department</label>
<input type="text" placeholder="Enter Your Department." name="emp_dep"/>
<br/><br/>
<label>Designation</label>
<input type="text" placeholder="Enter Your Designation." name="emp_des"/>
<br/><br/>
<input type="submit" value="insert data" />
<input type="reset" value="reset" />

</form>


</body>
</html>