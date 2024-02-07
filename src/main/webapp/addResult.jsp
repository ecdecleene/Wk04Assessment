<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Result</title>
</head>
<body>
	<h1>Addition Results:</h1>
	<p>${userAddition.getAddition()}</p>
	<a href="index.jsp">Back to Home</a>
</body>
</html>