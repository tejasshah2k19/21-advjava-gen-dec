package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProjectBean;
import com.dao.ProjectDao;

//new servlet --> web.xml --> service 


public class AddProjectServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//getParameter 
		String title = request.getParameter("title");
		String description = request.getParameter("description");

		
		ProjectBean projectBean = new ProjectBean();
		projectBean.setTitle(title);
		projectBean.setDescription(description);
		
		//insert
		ProjectDao projectDao = new ProjectDao();
		projectDao.insertProject(projectBean);
		response.sendRedirect("AddProject.jsp");
	}

}
