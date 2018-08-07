package cn.peanut.service;

import cn.peanut.bean.po.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> selectByPid(Integer Pid);
    Menu selectById(Integer id);
    Menu selectByName(String name);
    List<Menu> findAll();
    void deleteMenuById(Integer id);
    void insert(Menu menu);
    void update(Menu menu);
}
