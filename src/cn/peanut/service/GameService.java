package cn.peanut.service;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.po.GameExample;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.exception.MessageException;

import java.util.List;

public interface GameService {

    List<Game> selectByExample(GameExample example);
    List<Game> selectGamesListByPage(Integer page,Integer size);
    List<Game> selectAllGamesList();
    Game selectGame(Integer id);
    GameVo change(Game game);
    Game selectGame(String name);
    void addGame(Game game);
    void updateGame(Game game) throws MessageException;
    void delete(Integer id);
}
