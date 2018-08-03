package cn.peanut.service;

import cn.peanut.bean.po.UserRoleKey;

public interface UserRoleService {
    UserRoleKey selectByUserId(Integer id);
    void insert(UserRoleKey userRoleKey);
    void updateRoleId(UserRoleKey userRoleKey);
}
