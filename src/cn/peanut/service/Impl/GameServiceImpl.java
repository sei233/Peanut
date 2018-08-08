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
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    //通过id查询商品
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
    public Game selectGame(Integer id) {
        return gameMapper.selectByPrimaryKey(id);
    }

    @Override
    public Game selectGameName(String name) {
        return gameMapper.selectByName(name);
    }

    //多例查询
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
    public List<Game> selectByExample(GameExample example) {
        return gameMapper.selectByExample(example);
    }

    //通过页数查询商品列表
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
    public List<Game> selectGamesListByPage(Integer page, Integer size) {
        int index = (page - 1) * size;
        return gameMapper.selectByPage(index, size);
    }

    //查询所有的商品列表
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
    public List<Game> selectAllGamesList() {
        return gameMapper.selectByExample(null);
    }

    @Override
    public void addGame(Game game) {
        StringUtil stringUtil = new StringUtil();
        game.setGameDownload(0);
        game.setGameYear(Integer.parseInt(stringUtil.getYear()));
        game.setGameMonth(Integer.parseInt(stringUtil.getMonth()));
        gameMapper.insert(game);
    }

    @Override
    public void updateGame(Game game) throws MessageException {
        if (game.getGameName().equals("")
                && game.getGameTitle().equals("")
                && game.getGameSize() == null
                && game.getGamePic() == null
                && game.getGameIosaddress().equals("")
                && game.getGameAndroidaddress().equals("")
                && game.getGameAdviseType() == null
                && game.getGameStatus() == null
                && game.getGameType() == null
                && game.getGameOperation() == null
                && game.getGameDescription().equals("")) {
            throw new MessageException("条目不能全为空");
        }

        StringUtil stringUtil = new StringUtil();
        game.setGameYear(Integer.parseInt(stringUtil.getYear()));
        game.setGameMonth(Integer.parseInt(stringUtil.getMonth()));
        gameMapper.updateByPrimaryKeySelective(game);
    }

    @Override
    public void delete(Integer id) {
        gameMapper.deleteByPrimaryKey(id);
    }
}
