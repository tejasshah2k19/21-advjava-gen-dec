package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {
	// main
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String x = request.getParameter("n1");// ""
		String y = request.getParameter("n2");

		boolean isError = false;
		String error = "";
		if (x == null || x.trim().length() == 0) {
			isError = true;
			error = error + "<br>Please Enter n1 ";
		}

		if (y == null || y.trim().length() == 0) {
			isError = true;
			error += "<br>Please Enter n2";
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		if (isError == true) {

			out.print("ERROR : " + error);

		} else {
			int n1 = Integer.parseInt(x);
			int n2 = Integer.parseInt(y);

			int ans = n1 + n2;

			out.print("ans = " + ans);
		}
		out.print("</body></html>");

	}
}
