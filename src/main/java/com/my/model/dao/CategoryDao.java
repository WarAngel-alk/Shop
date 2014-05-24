package com.my.model.dao;

import com.my.model.entity.Category;

/**
 * Created with IntelliJ IDEA.
 * User: Vlad
 * Date: 24.05.14
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryDao {

    public Category findById(long id);

    public boolean save(Category category);

    public boolean delete(Category category);

}
