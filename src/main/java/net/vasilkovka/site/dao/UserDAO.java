package net.vasilkovka.site.dao;

import java.util.List;
import net.vasilkovka.site.domain.User;

public interface UserDAO {

	public void addContact(User user);

	public List<User> listContact();

	public void removeContact(Integer id);
}