package com.MVC.allUsBears.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends AbstractEntity {


//    @Size(min=2, max=144, message = "Please enter a name between 2 - 144 characters long.")
    private String pwHash;

    private String email;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Transaction> transaction = new ArrayList<>();

    public User(String pwHash, String email) {
        this.pwHash = pwHash;
        this.email = email;
    }

    public User(){}

    public String getPwHash() {
        return pwHash;
    }

    public void setPwHash(String pwHash) {
        this.pwHash = pwHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
