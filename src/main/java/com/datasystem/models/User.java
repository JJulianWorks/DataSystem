package com.datasystem.models;

public class User {

    private Integer idUser;
    private String nameUser;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private String level;
    private String status;
    private String register_by;

    public User(Integer idUser, String nameUser, String email, String phoneNumber,
                String username, String password, String level,
                String status, String register_by) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.level = level;
        this.status = status;
        this.register_by = register_by;
    }

    public int getIdUser() {
        return idUser;
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

    public String getRegister_by() {
        return register_by;
    }
}
