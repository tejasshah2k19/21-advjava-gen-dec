<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit project</title>
</head>
<body>



<form action="UpdateProjectServlet">

	Title : 	<input type="text" name="title" value="${project.title}" /><br><br> 
	Description : <input type="text" name="description" value="${project.description}" /><br><br> 
	<input type="hidden" name="projectId" value="${project.projectId}">
	<input type="submit" value="Update Project">

</form>
<br><br>

<a href="ListProjectServlet">List Projects</a>


</body>
</html>