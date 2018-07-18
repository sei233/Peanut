package cn.peanut.controller;

import cn.peanut.bean.po.Game;
import cn.peanut.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping("/test.action")
    public String gameSearch(Model model){
        Integer id =10;
        Game game = gameService.selectItemsList(id);
        System.out.println(game);
        return "/index";
    }
}
