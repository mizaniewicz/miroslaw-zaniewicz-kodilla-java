package com.kodilla.good.patterns.challenges.service;

public class User {
    private String id;
    private String userName;
    private String userSurname;
    private String address;

    public User(String id, String userName, String userSurname, String address) {
        this.id = id;
        this.userName = userName;
        this.userSurname = userSurname;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getAddress() {
        return address;
    }
}
