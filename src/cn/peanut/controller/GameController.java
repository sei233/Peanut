package cn.peanut.controller;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

    //通过id查找——>通过name模糊查询
    @RequestMapping("/find.action")
    public String gameSearch(Model model,Integer id){
        Game game = gameService.selectGame(id);
        GameVo gameVo = gameService.change(game);
        model.addAttribute("game",gameVo);
        return "/index";
    }

    //显示游戏列表
    @RequestMapping("/show.action")
    public String showGameList(Model model){
        List<GameVo> gameVoList = new ArrayList<>();
        GameVo gameVo;
        List<Game> gameList = gameService.selectGamesList();
        Iterator iter = gameList.iterator();

        while(iter.hasNext()){
            gameVo = gameService.change((Game) iter.next());
            gameVoList.add(gameVo);
        }

        model.addAttribute("gamesList",gameVoList);
        return "/index";
    }
}
