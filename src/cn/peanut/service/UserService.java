package cn.peanut.service;

import cn.peanut.bean.po.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User selectByName(String name);
    void insertUser(User user);
}
