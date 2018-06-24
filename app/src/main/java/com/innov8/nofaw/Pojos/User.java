package com.innov8.nofaw.Pojos;

/**
 * Created by Biruk on 6/25/2018.
 */

public class User {
    String name;
    String id;
    String phoneNumber;
    String type;
    String password;

    public User(){}

    public User(String name, String id, String phoneNumber, String type, String email) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.password = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
