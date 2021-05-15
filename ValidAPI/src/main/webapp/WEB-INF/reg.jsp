<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" action="Message"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="pass">Password</form:label></td>
				<td><form:password path="pass" name="pass"
						id="password" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email"
						id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="contact">contact</form:label></td>
				<td><form:input path="contact" name="contact" id="contact" /></td>
			</tr>
			
			<tr>
				<td><form:label path="city">City</form:label></td>
				<td><form:input path="city" name="city" id="city" /></td>
			</tr>
			<tr>
				<td><form:label path="zip">Zip</form:label></td>
				<td><form:input path="zip" name="zip" id="zip" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="reg" name="reg">Register</form:button></td>
			</tr>
			<tr></tr>
			
		</table>
	</form:form>

</body>
</html>