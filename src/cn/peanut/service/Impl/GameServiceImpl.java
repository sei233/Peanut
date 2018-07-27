package cn.peanut.service.Impl;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.po.GameExample;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.exception.MessageException;
import cn.peanut.mapper.GameMapper;
import cn.peanut.service.GameService;
import cn.peanut.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

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

        gameVo.setGameId(game.getGameId());
        gameVo.setGameName(game.getGameName());
        gameVo.setGameTitle(game.getGameTitle());
        gameVo.setGameDownload(game.getGameDownload());
        gameVo.setGameSize(game.getGameSize());
        gameVo.setGameStatus(status);
        gameVo.setGameType(type);
        gameVo.setGameOperation(operation);
        gameVo.setGameAdviseType(advise);
        gameVo.setGameIcon(game.getGameIcon());
        gameVo.setGamePic(game.getGamePic());
        gameVo.setGameIosaddress(game.getGameIosaddress());
        gameVo.setGameAndroidaddress(game.getGameAndroidaddress());
        gameVo.setGameDescription(game.getGameDescription());
        gameVo.setGameUpdateDate(game.getGameYear()+"-"+game.getGameMonth());
        return gameVo;
    }

    //通过id查询商品
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
    public Game selectGame(Integer id){
        return gameMapper.selectByPrimaryKey(id);
    }

    //多例查询
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
    public List<Game> selectByExample(GameExample example) {
        return gameMapper.selectByExample(example);
    }

    //通过页数查询商品列表
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
    public List<Game> selectGamesListByPage(Integer page,Integer size) {
        int index=(page-1)*size;
        return gameMapper.selectByPage(index,size);
    }

    //查询所有的商品列表
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
    public List<Game> selectAllGamesList(){
        return gameMapper.selectByExample(null);
    }

    @Override
    public void addGame(Game game) {
        StringUtil stringUtil = new StringUtil();
        game.setGameDownload(0);
        game.setGameYear(Integer.parseInt(stringUtil.getYear()));
        game.setGameMonth(Integer.parseInt(stringUtil.getMonth())+1);
        gameMapper.insert(game);
    }

    @Override
    public void updateGame(Game game) throws MessageException{
        if(game.getGameName().equals("")
                &&game.getGameTitle().equals("")
                &&game.getGameSize()==null
                &&game.getGamePic()==null
                &&game.getGameIosaddress().equals("")
                &&game.getGameAndroidaddress().equals("")
                &&game.getGameAdviseType()==null
                &&game.getGameStatus()==null
                &&game.getGameType()==null
                &&game.getGameOperation()==null
                &&game.getGameDescription().equals("")){throw new MessageException("条目不能全为空");}

        StringUtil stringUtil = new StringUtil();
        game.setGameYear(Integer.parseInt(stringUtil.getYear()));
        game.setGameMonth(Integer.parseInt(stringUtil.getMonth())+1);
        gameMapper.updateByPrimaryKeySelective(game);
    }

    @Override
    public void delete(Integer id) {
        gameMapper.deleteByPrimaryKey(id);
    }
}
