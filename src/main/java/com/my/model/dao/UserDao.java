package com.my.model.dao;

import com.my.model.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 24.05.14
 * Time: 12:47
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {

    public User find(long id);

    public boolean save(User user);

    public boolean delete(User user);

}
