package com.synisys.training.servlets;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet
		extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getMethod() + " " + response.getStatus());
		System.out.println(request.getReader().readLine());
		Gson json = new Gson();
//		System.out.println(request.getParameter("type"));
//		if (request.getParameter("type").equals("signIn")) {
//			JsonObject jsonObject = json.fromJson(request.getReader().readLine(), JsonObject.class);
//			System.out.println(jsonObject.get("username"));
//			System.out.println("ssss");
//		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getMethod() + " " + response.getStatus());
	}
}
