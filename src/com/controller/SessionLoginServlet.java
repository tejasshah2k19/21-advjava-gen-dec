package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//17 
		//true 
		
		//session - email 
		
		HttpSession session =   request.getSession();
		session.setAttribute("email", email);//set email in user's session 
		session.setMaxInactiveInterval(60*17);//seconds 
		response.sendRedirect("SessionHome.jsp");
		
	
	}
}
