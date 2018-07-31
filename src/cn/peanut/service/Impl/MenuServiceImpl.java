package cn.peanut.service.Impl;


import cn.peanut.bean.po.ChildMenu;
import cn.peanut.bean.po.Menu;
import cn.peanut.mapper.ChildMenuMapper;
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
}
