package cn.peanut.service.Impl;

import cn.peanut.bean.po.TopSub;
import cn.peanut.mapper.TopSubMapper;
import cn.peanut.service.TopSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class TopSubServiceImpl implements TopSubService {

    @Autowired
    private TopSubMapper topSubMapper;

    @Override
    public List<TopSub> selectByTop(Integer topCtgyId) {
        return topSubMapper.selectByTop(topCtgyId);
    }
}
