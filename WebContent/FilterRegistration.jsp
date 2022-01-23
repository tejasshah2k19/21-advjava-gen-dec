<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
	%>

	<h2>RegistrationPage</h2>


	<form action="FilterRegistrationServlet" method="post">

		FirstName : <input type="text" name="firstName" />
		<%=firstNameError == null ? "" : firstNameError%>
		<br> Email : <input type="text" name="email"><%=emailError == null ? "" : emailError%>
		<br> Password:<input type="password" name="password" />
		<%=passwordError != null ? passwordError : ""%>

		<br> <input type="submit" value="Signup" />


	</form>




</body>
</html>