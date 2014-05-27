package com.my.model.daoImpl;

import com.my.model.dao.OrderDao;
import com.my.model.entity.Category;
import com.my.model.entity.User;
import com.my.model.entity.order.Order;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 27.05.14
 * Time: 7:17
 * To change this template use File | Settings | File Templates.
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public Category findById(long id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Order order) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Order order) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Order> selectByUser(User user) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
