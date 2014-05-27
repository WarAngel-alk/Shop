package com.my.model.daoImpl;

import com.my.model.dao.ProductDao;
import com.my.model.entity.Category;
import com.my.model.entity.Product;
import com.my.model.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 27.05.14
 * Time: 7:17
 * To change this template use File | Settings | File Templates.
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public User find(long id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Product product) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Product product) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
