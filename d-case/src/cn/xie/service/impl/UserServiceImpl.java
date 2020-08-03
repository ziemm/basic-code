package cn.xie.service.impl;

import cn.xie.dao.UserDao;
import cn.xie.dao.impl.UserDaoImpl;
import cn.xie.domain.User;
import cn.xie.service.UserService;

/**
 * @author: xie
 * @create: 2019-11-11 21:22
 **/
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
