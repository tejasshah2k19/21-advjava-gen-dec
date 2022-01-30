package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/FilterRegistrationServlet")
public class PasswordValidatorFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String password = request.getParameter("password");
		if (password.length() <= 7) {
			request.setAttribute("passwordError", "Please Enter atleast 8 characters");
			request.getRequestDispatcher("FilterRegistration.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}

	}

	public void destroy() {

	}

}
