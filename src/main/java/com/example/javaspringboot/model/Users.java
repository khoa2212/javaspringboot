package com.example.javaspringboot.model;

public class Users {

    private String usersId;


    private String usersName;

    private String email;

    private String usersPassword;


    public String getUsersId() {
        return usersId;
    }


    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }


    public String getUsersName() {
        return usersName;
    }

 
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }


    public String getEmail() {
        return email;
    }

 
    public void setEmail(String email) {
        this.email = email;
    }

 
    public String getUsersPassword() {
        return usersPassword;
    }


    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }
}