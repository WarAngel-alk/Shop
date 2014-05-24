package com.my.model.entity.order;

import com.my.model.entity.Product;
import com.my.model.entity.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 22.05.14
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, updatable = false)
    private Date date;

    @Column(nullable = false, updatable = false)
    private long totalPrice;

    @ManyToOne
    private User owner;

    @OneToMany(fetch = FetchType.EAGER)
    private List<OrderItem> orderItems;

    Order() {
        orderItems = new ArrayList<>();
    }

    Order(Date date, long totalPrice, User owner, List<OrderItem> orderItems) {
        this();
        this.date = date;
        this.totalPrice = totalPrice;
        this.owner = owner;
        this.orderItems = orderItems;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Entity
    static class OrderItem {

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

}
