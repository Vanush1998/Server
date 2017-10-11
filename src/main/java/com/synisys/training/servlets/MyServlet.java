package com.synisys.training.servlets;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.synisys.training.model.User;
import com.synisys.training.service.SignInService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet
        extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            System.out.println(request.getMethod() + " " + response.getStatus());
            Gson gson = new Gson();
            switch (request.getParameter("type")) {
                case "signIn":
                    JsonObject jsonObject = gson.fromJson(request.getReader().readLine(), JsonObject.class);
                    SignInService.getInstance().signIn(jsonObject, response);
                case "signUp":
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        System.out.println(request.getMethod() + " " + response.getStatus());
    }
}
