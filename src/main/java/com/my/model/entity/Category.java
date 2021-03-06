package com.my.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 22.05.14
 * Time: 18:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = true, length = 200)
    private String picturePath;

    @Column(nullable = true, length = 1000)
    private String description;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

    @ManyToOne(optional = true, targetEntity = Category.class)
    private Category superCategory;

    Category() {
        products = new ArrayList<>();
    }

    public Category(String name) {
        this();
        this.name = name;
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
