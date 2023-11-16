package com.MVC.allUsBears.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Transaction{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;
    private BigDecimal  price;
    @Temporal(TemporalType.DATE)
    private Date datePurchased;
    @Temporal(TemporalType.DATE)
    private Date dateShipped;

    @ManyToOne
    private Recipient recipient;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> product = new ArrayList<>();

    public Transaction(int id, int quantity, BigDecimal price, Date datePurchased, Date dateShipped, Recipient recipient, User user, List<Product> product) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.datePurchased = datePurchased;
        this.dateShipped = dateShipped;
        this.recipient = recipient;
        this.user = user;
        this.product = product;
    }

    public Transaction(){}

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
