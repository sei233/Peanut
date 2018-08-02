package cn.peanut.service;

import cn.peanut.bean.po.TopSub;

import java.util.List;

public interface TopSubService {
    List<TopSub> selectByTop(Integer topCtgyId);
}
