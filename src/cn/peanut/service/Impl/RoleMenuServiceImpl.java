package cn.peanut.service.Impl;


import cn.peanut.bean.po.RoleMenu;
import cn.peanut.mapper.RoleMenuMapper;
import cn.peanut.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public RoleMenu selectByRoleId(Integer id) {
        return roleMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(RoleMenu roleMenu) {
        roleMenuMapper.updateByPrimaryKey(roleMenu);
    }

    @Override
    public List<RoleMenu> findAll() {
        return roleMenuMapper.selectByExample(null);
    }
}
