package web.DAO;
import web.model.User;

import java.util.List;

public interface UserDAO {

     List<User> findAll();
     void save(User user);
     void delete(int id);
     User findById(int id);
}
