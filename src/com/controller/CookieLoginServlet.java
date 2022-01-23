package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieLoginServlet")
public class CookieLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;
		if (password.equals("admin")) {
			// home

			// how to set cookie in client's browser
			Cookie c = new Cookie("email", email);
			c.setMaxAge(60 * 60 * 24 * 7);//7days //0 

			response.addCookie(c);

			rd = request.getRequestDispatcher("CookieHome.jsp");
		} else {
			// login

			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("CookieLogin.jsp");
		}

		rd.forward(request, response);

	}
}
