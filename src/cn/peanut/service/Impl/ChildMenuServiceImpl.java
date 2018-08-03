package cn.peanut.service.Impl;


import cn.peanut.bean.po.ChildMenu;
import cn.peanut.bean.po.UserRoleKey;
import cn.peanut.mapper.ChildMenuMapper;
import cn.peanut.mapper.UserRoleMapper;
import cn.peanut.service.ChildMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class ChildMenuServiceImpl implements ChildMenuService {

    @Autowired
    private ChildMenuMapper childMenuMapper;


    @Override
    public ChildMenu selectById(Integer id) {
        return childMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ChildMenu> selectByPid(Integer id) {
        return childMenuMapper.selectByPid(id);
    }

    @Override
    public List<ChildMenu> findAll() {
        return childMenuMapper.selectByExample(null);
    }

    @Override
    public void deleteMenuById(Integer id) {
        childMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(ChildMenu menu) {
        childMenuMapper.insert(menu);
    }

    @Override
    public void update(ChildMenu menu) {
        childMenuMapper.updateByPrimaryKeySelective(menu);
    }
}
