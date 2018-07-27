package cn.peanut.service.Impl;


import cn.peanut.bean.po.RoleMenuKey;
import cn.peanut.bean.po.UserRoleKey;
import cn.peanut.mapper.RoleMenuMapper;
import cn.peanut.mapper.UserRoleMapper;
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
    public List<RoleMenuKey> selectByRoleId(Integer id) {
        return roleMenuMapper.selectByRoleId(id);
    }
}
