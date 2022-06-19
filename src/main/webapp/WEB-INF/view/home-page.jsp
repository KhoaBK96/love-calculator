<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>

<style type="text/css">
.error{
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 15px;
}


</style>

<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yn").value;
		if (userName.length < 3) {
			alert("your name should have at least 2 character")
			return false;
		}
		else{
			return true;
		}
	};
</script>

</head>
<body>

	<h1 align="center">Love calculator</h1>

	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" >
		<div align="center">
			<p>
				<label for="yn">Your name :</label>
				<form:input id="yn" path="userName" />
				<form:errors cssClass="error" path="userName"/>
			</p>

			<p>
				<label for="cn">Crush name :</label>
				<form:input id="cn" path="crushName" />
			</p>
			
			<p>
			 <form:checkbox path="termAndCondition" id="check"/>
			 <label>I am agree</label>
			 <form:errors path="termAndCondition"/>
			</p>

			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>