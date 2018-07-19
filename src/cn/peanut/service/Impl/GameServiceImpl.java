package cn.peanut.service.Impl;

import cn.peanut.bean.po.Game;
import cn.peanut.mapper.GameMapper;
import cn.peanut.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    //查询商品列表
    public Game selectItemsList(Integer id){
        return gameMapper.selectByPrimaryKey(id);
    }

}
