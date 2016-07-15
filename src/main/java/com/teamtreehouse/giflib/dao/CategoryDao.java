package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

/**
 * Created by Luiz on 14/07/16.
 */
public interface CategoryDao {
    void save(Category category);
    void delete(Category category);
    Category findById(long id);
    List<Category> findAll();
}
