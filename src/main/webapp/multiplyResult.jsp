<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Result</title>
</head>
<body>
	<h1>Multiplication Result:</h1>
	<p>${userMultiplication.getMultiplication()}</p>
	<a href="index.jsp">Back to Home</a>
</body>
</html>