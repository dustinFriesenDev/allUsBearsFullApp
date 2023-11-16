package com.MVC.allUsBears.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product extends AbstractEntity{

    private String color;
    private String size;
    private String type;

    @ManyToMany(mappedBy = "product")
    private List<Transaction> transaction = new ArrayList<>();

    public Product(){}

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
