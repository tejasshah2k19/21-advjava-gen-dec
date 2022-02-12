package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProjectBean;
import com.dao.ProjectDao;

 
public class SearchProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String searchName = request.getParameter("searchName");
		ProjectDao projectDao = new ProjectDao();
		ArrayList<ProjectBean> projects = projectDao.searchProjec(searchName); 
		
		request.setAttribute("projects", projects);

		request.getRequestDispatcher("ProjectSearchResult.jsp").forward(request, response);
		
		
	}

}
