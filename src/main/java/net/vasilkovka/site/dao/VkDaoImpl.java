package net.vasilkovka.site.dao;

import net.vasilkovka.site.domain.VKMapper;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ivan Zhuravel
 * Date: 3/30/14
 * Time: 10:39 PM
 *
 */
@Repository
public class VkDaoImpl implements VkDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addVkProfile(VKMapper forSave) {
        sessionFactory.getCurrentSession().save(forSave);
    }

    @Override
    public VKMapper getVkProfile(Integer id) {
        return (VKMapper) sessionFactory.getCurrentSession().get(VKMapper.class, id);
    }

    @Override
    public void removeVkProfile(Integer id) {
        sessionFactory.getCurrentSession().delete(id);
    }

    @Override
    public void updateVkProfile(VKMapper forSave) {
        sessionFactory.getCurrentSession().merge(forSave);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
