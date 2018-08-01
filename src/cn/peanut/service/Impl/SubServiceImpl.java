package cn.peanut.service.Impl;

import cn.peanut.bean.po.SubCtgy;
import cn.peanut.bean.po.TopCtgy;
import cn.peanut.mapper.SubCtgyMapper;
import cn.peanut.mapper.TopCtgyMapper;
import cn.peanut.service.SubService;
import cn.peanut.service.TopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class SubServiceImpl implements SubService {

    @Autowired
    private SubCtgyMapper subCtgyMapper;

    @Override
    public SubCtgy selectById(Integer id) {
        return subCtgyMapper.selectByPrimaryKey(id);
    }
}
