package com.pojo;

import lombok.Data;

@Data
public class User {
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    private int id;
    private String name;
    private String pwd;
}
