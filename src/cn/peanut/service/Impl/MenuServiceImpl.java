package cn.peanut.service.Impl;



import cn.peanut.bean.po.Menu;
import cn.peanut.mapper.MenuMapper;
import cn.peanut.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Menu selectById(Integer id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Override
    public Menu selectByName(String name) {
        return menuMapper.selectByName(name);
    }

    @Override
    public List<Menu> findAll() {
        return menuMapper.selectByExample(null);
    }

    @Override
    public void deleteMenuById(Integer id) {
        menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(Menu menu) {
        menuMapper.insert(menu);
    }

    @Override
    public void update(Menu menu) {
        menuMapper.updateByPrimaryKeySelective(menu);
    }
}
