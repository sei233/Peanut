package cn.peanut.service;

import cn.peanut.bean.po.ChildMenu;

import java.util.List;

public interface ChildMenuService {
    List<ChildMenu> selectByPid(Integer id);
}
