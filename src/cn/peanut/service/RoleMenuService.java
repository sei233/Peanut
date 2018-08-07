package cn.peanut.service;

import cn.peanut.bean.po.RoleMenu;

import java.util.List;

public interface RoleMenuService {
    RoleMenu selectByRoleId(Integer id);
    void update(RoleMenu roleMenu);
    List<RoleMenu> findAll();
    void insert(RoleMenu roleMenu);
}
