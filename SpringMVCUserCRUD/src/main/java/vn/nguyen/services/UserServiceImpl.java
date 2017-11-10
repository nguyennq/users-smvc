package vn.nguyen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nguyen.dao.UserDao;
import vn.nguyen.model.User;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by nals on 11/10/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
