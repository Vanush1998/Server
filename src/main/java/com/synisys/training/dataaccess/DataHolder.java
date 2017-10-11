package com.synisys.training.dataaccess;

import com.synisys.training.model.User;

import java.util.List;

public class DataHolder {
    public static List<User> usersList;
    public static void addPersonToList(User user) {
        usersList.add(user);
    }

    public static List<User> getPersonsList() {
        return usersList;
    }
}
