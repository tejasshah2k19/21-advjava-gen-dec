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
		String genderError = (String) request.getAttribute("genderError");

		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
		String genderValue = (String) request.getAttribute("genderValue");
	%>

	<h2>RegistrationPage</h2>


	<form action="RegistrationServlet" method="post">

		FirstName : <input type="text" name="firstName"
			value="<%=firstNameValue == null ? "" : firstNameValue%>" />
		<%=firstNameError == null ? "" : firstNameError%>
		<br> Email : <input type="text" name="email"
			value="<%=emailValue == null ? "" : emailValue%>"><%=emailError == null ? "" : emailError%>
		<br> Password:<input type="password" name="password" />
		<%=passwordError != null ? passwordError : ""%>
		<br> Gender: Male<input type="radio" name="gender" value="male"  <%=genderValue != null && genderValue.equals("male") ? "checked" : "" %>    />
		Female<input type="radio" name="gender" value="female" <%=genderValue != null && genderValue.equals("female") ? "checked" : "" %>  />
		<%=genderError == null ? "" : genderError%>
		<br> <input type="submit" value="Signup" />


	</form>




</body>
</html>