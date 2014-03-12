package net.vasilkovka.site.service;

import java.util.List;
import net.vasilkovka.site.domain.User;

public interface UserService {

	public void addContact(User user);

	public List<User> listContact();

	public void removeContact(Integer id);
}
