package cn.peanut.service.Impl;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.mapper.GameMapper;
import cn.peanut.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    //查询商品列表
    public Game selectGame(Integer id){
        return gameMapper.selectByPrimaryKey(id);
    }

    public GameVo change(Game game){
        GameVo gameVo = new GameVo();
        String status;
        switch(game.getGameStatus())
        {
            case 1:
                status="启用";
                break;
            default:
                status="下线";
        }

        String type;
        switch(game.getGameType())
        {
            case 0:
                type="休闲益智";
                break;
            case 1:
                type="网络游戏";
                break;
            case 2:
                type="动作冒险";
                break;
            case 3:
                type="棋牌中心";
                break;
            case 4:
                type="飞行射击";
                break;
            case 5:
                type="经营策略";
                break;
            case 6:
                type="角色扮演";
                break;
            case 7:
                type="体育竞技";
                break;
            default:
                type="未知";
        }

        String operation;
        switch(game.getGameOperation())
        {
            case 0:
                operation="all";
                break;
            case 1:
                operation="ios";
                break;
            case 2:
                operation="android";
                break;
            default:
                operation="unknown";
        }

        String advise;
        switch(game.getGameAdviseType())
        {
            case 0:
                advise="普通";
                break;
            case 1:
                advise="最新";
                break;
            case 2:
                advise="精选";
                break;
            case 3:
                advise="首页推荐";
                break;
            default:
                advise="未知";
        }

        gameVo.setGameName(game.getGameName());
        gameVo.setGameTitle(game.getGameTitle());
        gameVo.setGameDownload(game.getGameDownload());
        gameVo.setGameSize(game.getGameSize());
        gameVo.setGameStatus(status);
        gameVo.setGameType(type);
        gameVo.setGameOperation(operation);
        gameVo.setGameAdviseType(advise);
        return gameVo;
    }

    public List<Game> selectGamesList(){
        return gameMapper.selectByExample(null);
    }
}
