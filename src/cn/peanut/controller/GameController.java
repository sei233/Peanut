package cn.peanut.controller;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.po.GameExample;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.bean.vo.QueryVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.GameService;
import cn.peanut.util.StringUtil;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/game")
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class GameController {

    @Autowired
    GameService gameService;

    //显示游戏列表
    @RequestMapping("/show.action")
    public String showGameList(Model model, Integer page) {
        if (page == null) page = 1;
        Integer size = 3;
        List<GameVo> gameVoList = new ArrayList<>();
        GameVo gameVo;
        List<Game> gameList = gameService.selectGamesListByPage(page, size);
        Iterator iter = gameList.iterator();

        while (iter.hasNext()) {
            gameVo = gameService.change((Game) iter.next());
            if (gameVo.getGameStatus().equals("启用")) gameVoList.add(gameVo);
        }

        model.addAttribute("gamesList", gameVoList);
        return "/index";
    }

    //跳转add.jsp
    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
    public String gameRedirect() {
        return "/add";
    }

    //提交add表单
    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
    public String gameAdd(Game game, MultipartFile gamepic) throws IOException, MessageException {
        if (gamepic.getSize() != 0) {
            //图片名
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            //图片后缀名
            String ext = FilenameUtils.getExtension(gamepic.getOriginalFilename());
            //保存图片到目录
            gamepic.transferTo(new File("C:\\Users\\石乾\\Pictures\\Saved Pictures\\" + name + "." + ext));

            game.setGamePic(name + "." + ext);
        }
        //名字检索是否存在
        if (game.getGameName() == null || "".equals(game.getGameName()) )
        {throw new MessageException("游戏名不能为空");}
        gameService.addGame(game);
        return "redirect:/game/show.action";
    }

    //删除
    @RequestMapping(value = "/delete.action")
    public String gameDelete(Integer id) {
        gameService.delete(id);
        return "redirect:/game/show.action";
    }

    //跳转update.jsp
    @RequestMapping(value = "/update.action", method = RequestMethod.GET)
    public String gameRedirect2(Model model, Integer id) {
        Game game = gameService.selectGame(id);
        GameVo gameVo = gameService.change(game);
        model.addAttribute("game", gameVo);
        return "/update";
    }

    //提交update.jsp
    @RequestMapping(value = "/update.action", method = RequestMethod.POST)
    public String gameUpdate(QueryVo vo, MultipartFile pictureFile) throws Exception {
        if (pictureFile.getSize() != 0) {
            //图片名
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            //图片后缀名
            String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
            //保存图片到目录
            pictureFile.transferTo(new File("C:\\Users\\石乾\\Pictures\\Saved Pictures\\" + name + "." + ext));
            vo.getGame().setGamePic(name + "." + ext);
        }
        gameService.updateGame(vo.getGame());
        return "redirect:/game/show.action";
    }

    //查询
    @RequestMapping(value = "/search.action")
    public String gameSearch(Model model, String condition) {
        String strings = StringUtil.clearBlank(condition);
        String[] str = StringUtil.getNumber(strings);
        String number = str[0];
        String name = str[1];

        GameExample example = new GameExample();
        GameExample.Criteria criteria = example.createCriteria();
        criteria.andGameNameLike("%" + name + "%");
        if (!"".equals(number)) {
            if (number.length() == 4 && !"".equals(number.substring(0, 4)))
                criteria.andGameYearEqualTo(Integer.parseInt(number.substring(0, 4)));
            if (number.length() > 4 && number.length() < 7) {
                if (number.length() < 6) {
                    criteria.andGameMonthEqualTo(Integer.parseInt(number.substring(4, 5)));
                } else {
                    criteria.andGameMonthEqualTo(Integer.parseInt(number.substring(4, 6)));
                }
            }
        }
        List<Game> gameList = gameService.selectByExample(example);

        List<GameVo> gameVoList = new ArrayList<>();
        GameVo gameVo;
        Iterator iter = gameList.iterator();
        while (iter.hasNext()) {
            gameVo = gameService.change((Game) iter.next());
            gameVoList.add(gameVo);
        }

        model.addAttribute("gamesList", gameVoList);
        return "/index";
    }
}
