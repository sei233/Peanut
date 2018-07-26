package cn.peanut.controller;

import cn.peanut.bean.po.User;
import cn.peanut.exception.MessageException;
import cn.peanut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //显示游戏列表
    @RequestMapping("/login.action")
    public String login(Model model,User user) throws MessageException {
        if("".equals(user.getUserPassword())){throw new MessageException("密码不能为空");}
        User user1 = userService.selectByName(user.getUserName());
        if(user1.getUserPassword().equals(user.getUserPassword())){
            return "/home";
        }else{
            throw new MessageException("账户名或者密码错误");
        }
    }
}
