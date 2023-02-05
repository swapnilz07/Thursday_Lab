<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1  style='text-align:center; background-color:green' >Delete Record From The Table</h1>
<br/><br/>
<form action="delete_demo" method="post" >
<label>Enter Employee Id To Delete The Record OF The Employee.</label>
<br/><br/>
<input type="number" placeholder="Enter Employee ID" name="Id" />
<br/>
<input type="submit" value="Click here" />
<input type="reset" value="reset" />
</form>
</body>
</html>