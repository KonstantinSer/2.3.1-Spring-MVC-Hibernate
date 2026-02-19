package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDAO userDAO;


    @Transactional
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);

    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }


    @Override
    public void delete(int id) {
        userDAO.delete(id);

    }
}
