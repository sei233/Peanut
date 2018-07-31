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
    public List<ChildMenu> selectByPid(Integer id) {
        return childMenuMapper.selectByPid(id);
    }
}
