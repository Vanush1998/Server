package com.synisys.training.service;

public class SignInService {
    private static SignInService ourInstance = new SignInService();

    public static SignInService getInstance() {
        return ourInstance;
    }

    private SignInService() {
    }
}
