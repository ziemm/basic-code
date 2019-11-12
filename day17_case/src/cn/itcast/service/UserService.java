package cn.itcast.service;

import cn.itcast.domain.User;

public interface UserService {
    /**
     * 添加User的方法
     */
    void addUser(User user);

    /**
     * 登录方法
     */
    User login(User user);
}
