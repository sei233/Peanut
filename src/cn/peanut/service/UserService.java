package cn.peanut.service;

import cn.peanut.bean.po.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User selectById(Integer id);
    User selectByName(String name);
    void insertUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
}
