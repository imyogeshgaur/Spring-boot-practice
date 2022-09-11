package com.example.loginsignup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    public String email;
    public String password;

    public void setUserEmail(String email) {
        this.email = email;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public void setUserPasssword(String password) {
        this.password = password;
    }
    
}
