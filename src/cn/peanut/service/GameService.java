package cn.peanut.service;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.vo.GameVo;

import java.util.List;

public interface GameService {

    List<Game> selectGamesList();
    Game selectGame(Integer id);
    GameVo change(Game game);
    Game selectGame(String name);
    void addGame(Game game);
    void updateGame(Game game);
}
