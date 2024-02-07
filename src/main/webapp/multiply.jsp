<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Page</title>
</head>
<body>
	<h1>Multiplication Page</h1>
	<form action="MultiplicationServlet" method="post">
		Enter your first number:
		<input type="text" name="num1" size="10">
		Enter your second number:
		<input type="text" name="num2" size="10">
		<input type="submit" name="multiplication" value="Multiply Numbers" />
	</form>
	<a href="index.jsp">Back to Home</a>
</body>
</html>