package net.vasilkovka.site.service;
 
import java.util.List;

import net.vasilkovka.site.dao.UserDAO;
import net.vasilkovka.site.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

@Service
public class UserServiceImpl implements UserService {
 
    @Autowired
    private UserDAO userDAO;
 
    @Transactional
    public void addContact(User contact) {
        userDAO.addContact(contact);
    }
 
    @Transactional
    public List<User> listContact() {
 
        return userDAO.listContact();
    }
 
    @Transactional
    public void removeContact(Integer id) {
        userDAO.removeContact(id);
    }
}
