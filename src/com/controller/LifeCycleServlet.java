package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("init():LifeCycleServlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service():LifeCycleServlet");

		//
	}

	public void destroy() {
		System.out.println("destroy():LifeCycleServlet");
	}
}
