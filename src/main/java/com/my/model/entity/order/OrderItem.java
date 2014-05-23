package com.my.model.entity.order;


import com.my.model.entity.Product;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 23.05.14
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private long id;

    @Id
    @ManyToOne(optional = false)
    private Product product;

    @Column(nullable = false)
    private int amount;

    public OrderItem() {

    }

    public OrderItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
