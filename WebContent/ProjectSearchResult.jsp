<%@page import="com.bean.ProjectBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Search Result  -  Projects</title>
</head>
<body>

	<%
		ArrayList<ProjectBean> projects = (ArrayList<ProjectBean>) request.getAttribute("projects");
	%>


	<br><br>
	<a href="AddProject.jsp">Add Project</a> | <a href="ListProjectServlet">List Projects</a>
	<br><bR>

	<%
		if (projects.size() == 0) {
	%>

	........No Records Found......
	<%
		} else {
	%>




	<table border="1">
		<tr>
			<th>ProjectId</th>
			<th>Title</th>
			<th>Description</th>
			<th>Action</th>
		</tr>

		<%
			for (ProjectBean p : projects) {
		%>
		<tr>
			<td><%=p.getProjectId()%></td>
			<td><%=p.getTitle()%></td>
			<td><%=p.getDescription()%></td>
			<td><a href="DeleteProjectServlet?projectId=<%=p.getProjectId()%>"> Delete</a></td>
		</tr>
		<%
			}
		%>

	</table>

	<%
		}
	%>
</body>
</html>