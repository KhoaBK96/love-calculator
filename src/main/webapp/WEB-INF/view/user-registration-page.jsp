<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style type="text/css">
.error{
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 15px;
}


</style>
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
			<form:errors path="userName" cssClass="error"/>

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

			<br /> 
			
			<label>Age :</label>
			<form:input path="age" />
			<form:errors path = "age" cssClass="error"/>
			
		</div>

		<div align="center">

			<h3>Communication</h3>
			<label>Email :</label>
			<form:input path="communicationDTO.email" />
			<form:errors path="communicationDTO.email" cssClass="error"/>
			<br/>
			
			<label>Phone :</label>
			<form:input path="communicationDTO.phone" />

		</div>

		<br />
		
		<div align="center">
		<input type="submit" value="register">
		</div>
	</form:form>
</body>
</html>