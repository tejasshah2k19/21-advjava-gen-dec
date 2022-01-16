package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		String hobby[] = request.getParameterValues("hobby");
		
		
		
		
		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "<font color=red>Please Enter FirstName</font>");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "<font color=red>Please Enter Email</font>");
		}else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "<font color=red>Please Enter Password</font>");
		}else{
			request.setAttribute("passwordValue", password);
		}

		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "<font color=red>Please Select Gender</font>");
		}else {
			request.setAttribute("genderValue", gender);
		}

		if(hobby == null || hobby.length == 1) {
			isError = true;
			request.setAttribute("hobbyError",  "<font color=red>Please Select Atlease 2 hobby</font>");
		}
		
		
		RequestDispatcher rd = null;
		if (isError == true) {
			// registration
			rd = request.getRequestDispatcher("Registration.jsp");
		} else {
			// home
			rd = request.getRequestDispatcher("Home.jsp");

		}

		rd.forward(request, response);
	}
}
