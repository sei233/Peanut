package cn.peanut.controller;


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
    public String login(Model model){
        return "/home";
    }
}
