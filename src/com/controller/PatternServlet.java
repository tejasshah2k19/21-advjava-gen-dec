package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int no = Integer.parseInt(request.getParameter("no"));
		String pattern = request.getParameter("pattern");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		if (pattern.equals("upper")) {

			for (int i = 1; i <= no; i++) {
				for (int j = 1; j <= i; j++) {
					out.print("*");
				}
				out.print("<br>");
			}

		} else if (pattern.equals("lower")) {

			for (int i = 1; i <= no; i++) {
				for (int j = 1; j <= no - i + 1; j++) {
					out.print("*");
				}
				out.print("<br>");
			}
		}

		out.print("</body></html>");

	}
}
