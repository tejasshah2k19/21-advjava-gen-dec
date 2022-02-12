package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDao;

/**
 * Servlet implementation class DeleteProjectServlet
 */
public class DeleteProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int projectId = Integer.parseInt(request.getParameter("projectId"));
		ProjectDao projectDao = new ProjectDao();
		projectDao.deleteProject(projectId); 
		
		response.sendRedirect("ListProjectServlet");
	}

}
