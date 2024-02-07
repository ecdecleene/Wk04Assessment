<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Page</title>
</head>
<body>
	<h1>Addition Page</h1>
	<form action="AdditionServlet" method="post">
		Enter your first number:
		<input type="text" name="num1" size="10">
		Enter your second number:
		<input type="text" name="num2" size="10">
		<input type="submit" name="addition" value="Add Numbers" />
	</form>
	<a href="index.jsp">Back to Home</a>
</body>
</html>