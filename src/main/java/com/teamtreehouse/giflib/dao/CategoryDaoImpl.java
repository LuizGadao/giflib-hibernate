package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Luiz on 14/07/16.
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public Category findById(long id) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Category> findAll() {
        Session session = sessionFactory.openSession();
        List categories = session.createCriteria(Category.class).list();
        session.close();

        return categories;
    }
}
