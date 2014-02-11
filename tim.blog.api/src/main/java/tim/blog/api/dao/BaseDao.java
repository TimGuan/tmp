package tim.blog.api.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

@Repository
public abstract class BaseDao {
    @Autowired
    private SessionFactory sessionFactory;

    public <T> Serializable save(T t) {
        return getSession().save(t);
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByConditions(Class<T> type, HashMap<String, Object> conditions) {
        return getSession().createCriteria(type).add(Restrictions.allEq(conditions)).list();

    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findAll(Class<T> type) {
        return getSession().createCriteria(type).list();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findAll(Class<T> type, String order) {
        return getSession().createCriteria(type).addOrder(Order.asc(order)).list();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> get(T example) {
        return getSession().createCriteria(example.getClass()).add(Example.create(example)).list();
    }

    public <T> void update(T type) {
        getSession().update(type);
    }

    public <T> void merge(T type) {
        getSession().merge(type);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> type, long id) {
        return (T) getSession().get(type, id);
    }

    public <T> void delete(Class<T> type, long id) {
        getSession().delete(get(type, id));
    }
}
