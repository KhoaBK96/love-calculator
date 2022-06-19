<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love calculator</h1>
	<hr>

	<h2>The Love Calculator Predicts :</h2>
	<br /> ${userInfo.userName} and ${userInfo.crushName} are
	<br /> FRIEND
	<br />
	<a href="/spring-love-calculator/sendEmail">Send result to Your Email</a>

</body>
</html>