package com.mphasis.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
    
    @Autowired
    SessionFactory sessionFactory;
    protected Session getSession() {
        return (Session) sessionFactory.getCurrentSession();
    }
    @Override
    public List<Admin> adminLogin(Admin admin) {
        Criteria c = getSession().createCriteria(Admin.class);
        Criterion criterion=Restrictions.eq("admin_username",admin.getAdmin_username());
        Criterion criterion2=Restrictions.eq("admin_password",admin.getAdmin_password());
        Criterion criterion3=Restrictions.and(criterion,criterion2);
        c.add(criterion3);
        return c.list();
    }
    
}