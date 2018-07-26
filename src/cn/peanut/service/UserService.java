package cn.peanut.service;

import cn.peanut.bean.po.User;

public interface UserService {
    User selectByName(String name);
}
