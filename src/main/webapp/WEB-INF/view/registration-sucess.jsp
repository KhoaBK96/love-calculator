<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration is successful</h1>
	<h2>The details entered by you are :</h2>
	Name : ${userReg.name}
	<br /> User Name : ${userReg.userName}
	<br /> Password : ${userReg.password}
	<br /> Country : ${userReg.countryName}
	<br /> Hobbies :

	<c:forEach var="temp" items="${userReg.hobbies}">
	${temp}
	</c:forEach>
	<br /> Gender : ${userReg.gender}
	<br />
	Email : ${userReg.communicationDTO.email}
	<br/>
	Phone: ${userReg.communicationDTO.phone}
</body>
</html>