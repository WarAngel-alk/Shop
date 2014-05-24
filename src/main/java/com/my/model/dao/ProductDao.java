package com.my.model.dao;

import com.my.model.entity.Category;
import com.my.model.entity.Product;
import com.my.model.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 24.05.14
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public interface ProductDao {

    public User find(long id);

    public boolean save(Product product);

    public boolean delete(Product product);

    public List<Product> findByCategory(Category category);

}
