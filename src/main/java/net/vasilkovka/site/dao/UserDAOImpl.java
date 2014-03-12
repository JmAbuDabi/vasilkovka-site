package net.vasilkovka.site.dao;

import java.util.List;

import net.vasilkovka.site.domain.User;

import net.vasilkovka.site.dao.UserDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addContact(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> listContact() {

		return sessionFactory.getCurrentSession().createQuery("from User")
			.list();
	}

	public void removeContact(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, id);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}

	}
}
