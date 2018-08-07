package cn.peanut.service;

import cn.peanut.bean.po.Role;

public interface RoleService {
    void insert(Role role);
    Role selectByName(String roleName);
    Role selectById(Integer id);
    void deleteById(Integer id);
}
