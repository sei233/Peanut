package cn.peanut.service.Impl;


import cn.peanut.bean.po.UserRoleKey;
import cn.peanut.mapper.UserRoleMapper;
import cn.peanut.service.UserRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRoleKey selectByUserId(Integer id) {
        return userRoleMapper.selectByUserId(id);
    }
}
