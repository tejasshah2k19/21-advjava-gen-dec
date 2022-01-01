package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("SignupServlet::service()");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		// produce html content using servlet -->

		response.setContentType("text/html");// MIME

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("FirstName : " + firstName + "<br>");
		out.print("Email : " + email + "<br>");
		out.print("Password : " + password + "<br>");

		out.print("</body></html>");

	}

}
