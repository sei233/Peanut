package cn.peanut.service;

import cn.peanut.bean.po.UserRoleKey;

public interface UserRoleService {
    UserRoleKey selectByUserId(Integer id);
}
