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
	<h1 align="center">Please register here</h1>
	<form:form action="registration-sucess" method="GET"
		modelAttribute="userReg">

		<div align="center">
			<label>Name :</label>
			<form:input path="name" />

			<br /> <label>User name :</label>
			<form:input path="userName" />

			<br /> <label>Password :</label>
			<form:input path="password" />

			<br /> <label>Country :</label>
			<form:select path="countryName">
				<form:option value="India" label="India"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="PAK" label="Pakistan"></form:option>
				<form:option value="Sl" label="Srilanka"></form:option>
			</form:select>

			<br /> <label>Hobbies :</label> Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Reading :
			<form:checkbox path="hobbies" value="reading" />
			Travel :
			<form:checkbox path="hobbies" value="travel" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />

			<br /> <label>Gender :</label> Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />

			<br /> <input type="submit" value="register">
		</div>
	</form:form>
</body>
</html>