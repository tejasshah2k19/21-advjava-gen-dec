package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProjectBean;
import com.dao.ProjectDao;

/**
 * Servlet implementation class EditProjectServlet
 */
public class EditProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  int projectId = Integer.parseInt(request.getParameter("projectId"));
			  
			  ProjectDao projectDao = new ProjectDao();
			  
			  ProjectBean project= projectDao.getProjectById(projectId);
			  request.setAttribute("project", project);
			  	
			  request.getRequestDispatcher("EditProject.jsp").forward(request, response);
	
	}

}
