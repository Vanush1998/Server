package com.synisys.training.servlets;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet
		extends HttpServlet {

	@Override protected void doHead(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doHead(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getMethod() + " " + response.getStatus()+" ");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getMethod() + " " + response.getStatus());
		System.out.println(request.getParameter("a"));
	}
}
