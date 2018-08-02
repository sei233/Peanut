package cn.peanut.service.Impl;

import cn.peanut.bean.po.TopCtgy;
import cn.peanut.mapper.TopCtgyMapper;
import cn.peanut.service.TopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class TopServiceImpl implements TopService {

    @Autowired
    private TopCtgyMapper topCtgyMapper;

    @Override
    public TopCtgy selectById(Integer topCtgyId) {
        return topCtgyMapper.selectByPrimaryKey(topCtgyId);
    }

    @Override
    public void update(TopCtgy topCtgy) {
        topCtgyMapper.updateByPrimaryKeySelective(topCtgy);
    }
}
