package com.thbs.jewellery.jewel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

@Entity
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    private String password;

    public AdminUser() {
    }

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
