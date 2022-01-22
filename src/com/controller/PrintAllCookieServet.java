package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintAllCookieServet")
public class PrintAllCookieServet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
		//fetch all the cookies from browser
	  Cookie c[] = 	request.getCookies(); //all coookies 
	
	  
	  response.setContentType("text/html");

	  PrintWriter out = response.getWriter();
	  
	  
	  out.print("<html><body>");
	  
	  for(Cookie x:c) {
		  out.print(x.getName()+"  =>  "+x.getValue()+"<br>");
	  }
	  
	  
	  out.print("</body></html>");
	  
	  
	  
	}
}
