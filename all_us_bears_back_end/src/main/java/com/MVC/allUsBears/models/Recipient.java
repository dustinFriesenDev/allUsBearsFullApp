package com.MVC.allUsBears.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipient extends AbstractEntity{


    private String streetAddress;
    private String city;
    private String postalCode;
    private String state;
    private String category;

    @OneToMany
    @JoinColumn(name="recipient_id")
    private List<Transaction> transaction = new ArrayList<>();

    public Recipient(String streetAddress, String city, String postalCode, String state, String category) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
        this.category = category;
    }

    public Recipient(){}

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
