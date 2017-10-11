package com.synisys.training.service;

public class SignUpService {
    private static SignUpService ourInstance = new SignUpService();

    public static SignUpService getInstance() {
        return ourInstance;
    }

    private SignUpService() {
    }

}
