package vn.nguyen.dao;

import vn.nguyen.model.User;

import java.util.List;

/**
 * Created by nals on 11/10/17.
 */
public interface UserDao {
    void add(User user);
    List<User> listUsers();
}
