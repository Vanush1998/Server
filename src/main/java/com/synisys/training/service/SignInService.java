package com.synisys.training.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.synisys.training.dataaccess.DataHolder;
import com.synisys.training.dataaccess.UserDaoJsonImp;
import com.synisys.training.model.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInService {
    private static SignInService ourInstance = new SignInService();

    public static SignInService getInstance() {
        return ourInstance;
    }

    private SignInService() {
    }

    public void signIn(JsonObject jsonObject, HttpServletResponse response) {
        UserDaoJsonImp.getInstance().loadUsers();
        for (User user : DataHolder.usersList) {
            if (user.getUsername().equals(jsonObject.get("username").getAsString()) &&
                    user.getPassword().equals(jsonObject.get("password").getAsString())) {
                try {
                    response.getWriter().write(new Gson().toJson(user));
                    response.getWriter().flush();
                    response.getWriter().close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Wrong username or password");
    }
}
