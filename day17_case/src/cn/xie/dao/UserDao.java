package cn.xie.dao;

import cn.xie.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {
    public List<User> findAll();

    User findById(int id);

    void add(User user);

    User findUserByUsernameAndPassword(String username,String password);

}
