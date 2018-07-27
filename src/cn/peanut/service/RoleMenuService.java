package cn.peanut.service;

import cn.peanut.bean.po.RoleMenuKey;

import java.util.List;

public interface RoleMenuService {
    List<RoleMenuKey> selectByRoleId(Integer id);
}
