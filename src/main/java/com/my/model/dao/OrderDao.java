package com.my.model.dao;

import com.my.model.entity.Category;
import com.my.model.entity.User;
import com.my.model.entity.order.Order;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 24.05.14
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
public interface OrderDao {

    public Category findById(long id);

    public boolean save(Order order);

    public boolean delete(Order order);

    public List<Order> selectByUser(User user);

}
