package com.datasystem.models;

public class User {

    private int id;
    private String nameUser;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private String level;
    private String status;
    private String regiser_by;

    public User(int id, String nameUser, String email, String phoneNumber,
                String username, String password, String level,
                String status, String regiser_by) {
        this.id = id;
        this.nameUser = nameUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.level = level;
        this.status = status;
        this.regiser_by = regiser_by;
    }

    public int getId() {
        return id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLevel() {
        return level;
    }

    public String getStatus() {
        return status;
    }

    public String getRegiser_by() {
        return regiser_by;
    }
}
