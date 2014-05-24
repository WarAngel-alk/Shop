package com.my.model.entity.order;

import com.my.model.entity.Product;
import com.my.model.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 23.05.14
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
public class OrderBuilder {

    private Date date;
    private User owner;
    private List<Order.OrderItem> orderItems;

    public OrderBuilder() {
        orderItems = new ArrayList<>();
    }

    public OrderBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public OrderBuilder setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public OrderBuilder addOrderItem(Product product, int amount) {
        orderItems.add(new Order.OrderItem(product, amount));
        return this;
    }

    public Order build() {
        if(owner == null) {
            throw new IllegalStateException("Order owner is not specified.");
        }
        if(date == null) {
            throw new IllegalStateException("Order date is not specified.");
        }
        if(orderItems.size() == 0) {
            throw new IllegalStateException("Items list is empty.");
        }

        long totalPrice = 0;
        for(Order.OrderItem oi : orderItems) {
            totalPrice += oi.getProduct().getPrice() * oi.getAmount();
        }

        return new Order(date, totalPrice, owner, orderItems);
    }

}
