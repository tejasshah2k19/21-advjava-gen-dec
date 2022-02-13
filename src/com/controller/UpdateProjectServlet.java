package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProjectBean;
import com.dao.ProjectDao;

 
public class UpdateProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int projectId =  Integer.parseInt( request.getParameter("projectId"));
		 String title = request.getParameter("title");
		 String description  = request.getParameter("description");
		 
		 
		 ProjectBean projectBean = new ProjectBean();
		 projectBean.setTitle(title);
		 projectBean.setDescription(description);
		 projectBean.setProjectId(projectId);
		 
		 
		 ProjectDao projectDao = new ProjectDao();
		 projectDao.updateProject(projectBean);
		 
		 response.sendRedirect("ListProjectServlet");
		 
		 
	}

}
