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
	%>

	<h2>RegistrationPage</h2>


	<form action="RegistrationServlet" method="post">

		FirstName : <input type="text" name="firstName" />
		<%=firstNameError == null ? "" : firstNameError%>
		<br> <input type="submit" value="Signup" />


	</form>




</body>
</html>