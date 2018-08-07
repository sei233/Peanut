package cn.peanut.service.Impl;

import cn.peanut.bean.po.Role;
import cn.peanut.mapper.RoleMapper;
import cn.peanut.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public void insert(Role role) {
        roleMapper.insert(role);
    }

    @Override
    public Role selectByName(String roleName) {
        return roleMapper.selectByName(roleName);
    }
}
