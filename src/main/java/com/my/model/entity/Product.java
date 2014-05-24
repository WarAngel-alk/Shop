package com.my.model.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 22.05.14
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private long price;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = true, length = 200)
    private String picturePath;

    @Column(nullable = true)
    private String description;

    Product() {}

    public Product(String name, long price, int amount) {
        this();
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
