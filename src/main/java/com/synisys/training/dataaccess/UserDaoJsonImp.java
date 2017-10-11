package com.synisys.training.dataaccess;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.synisys.training.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UserDaoJsonImp implements UserDaoJson {
    private static UserDaoJsonImp ourInstance = new UserDaoJsonImp();

    public static UserDaoJsonImp getInstance() {
        return ourInstance;
    }

    private UserDaoJsonImp() {
    }

    @Override
    public void loadUsers() {
        String content;
        try {
            URL resource = Thread.currentThread().getContextClassLoader().getResource("data.json");
            if (resource == null) {
                throw new RuntimeException("File data.json is missing");
            }
            content = new String(Files.readAllBytes(
                    Paths.get(resource.toURI())));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<User>>() {
        }.getType();
        DataHolder.usersList = gson.fromJson(content, type);
    }
}