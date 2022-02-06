package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProjectBean;
import com.dao.ProjectDao;

public class ListProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//serialization 

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// dao --> get all projects
		ProjectDao projectDao = new ProjectDao();
		ArrayList<ProjectBean> projects = projectDao.getAllProjects();

		// projects --> jsp -->

		request.setAttribute("projects", projects);
		
		request.getRequestDispatcher("ListProject.jsp").forward(request, response);
	}

}
