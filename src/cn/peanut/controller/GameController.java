package cn.peanut.controller;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            if(gameVo.getGameStatus().equals("启用"))gameVoList.add(gameVo);
        }

        model.addAttribute("gamesList",gameVoList);
        return "/index";
    }

    //跳转add.jsp
    @RequestMapping(value = "/add.action",method = RequestMethod.GET)
    public String gameRedirect(){
        return "/add";
    }

    //提交add表单
    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
    public String gameAdd(Game game){
//        通过名字检索是否存在
//        存在就调用更新
//        不存在就添加
        return "redirect:/show.action";
    }
}
