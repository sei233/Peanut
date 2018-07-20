package cn.peanut.controller;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.bean.vo.QueryVo;
import cn.peanut.service.GameService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

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
    public String gameAdd(Game game, MultipartFile gamepic) throws IOException {
        if(gamepic.getSize()!=0) {
            //图片名
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            //图片后缀名
            String ext = FilenameUtils.getExtension(gamepic.getOriginalFilename());
            //保存图片到目录
            gamepic.transferTo(new File("C:\\Users\\石乾\\Pictures\\Saved Pictures\\" + name + "." + ext));

            game.setGamePic(name + "." + ext);
        }
        //名字检索是否存在
        if(game.getGameName()!=null) gameService.addGame(game);
        return "redirect:/show.action";
    }

    //跳转update.jsp
    @RequestMapping(value = "/update.action",method = RequestMethod.GET)
    public String gameRedirect2(Model model,Integer id){
        Game game = gameService.selectGame(id);
        GameVo gameVo = gameService.change(game);
        model.addAttribute("game",gameVo);
        return "/update";
    }

    //提交update.jsp
    @RequestMapping(value = "/update.action", method = RequestMethod.POST)
    public String gameUpdate(QueryVo vo,MultipartFile pictureFile) throws IOException {
        if(pictureFile.getSize()!=0) {
            //图片名
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            //图片后缀名
            String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
            //保存图片到目录
            pictureFile.transferTo(new File("C:\\Users\\石乾\\Pictures\\Saved Pictures\\" + name + "." + ext));
            vo.getGame().setGamePic(name + "." + ext);
        }
        gameService.updateGame(vo.getGame());
        return "redirect:/show.action";
    }
}
