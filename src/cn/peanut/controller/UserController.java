package cn.peanut.controller;

import cn.peanut.bean.po.User;
import cn.peanut.exception.MessageException;
import cn.peanut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login.action",method = RequestMethod.GET)
    public String login() {
        return "redirect:/login.jsp";
    }

    //登录
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(Model model,User user,HttpSession httpSession) throws MessageException {
        if("".equals(user.getUserPassword())){throw new MessageException("密码不能为空");}
        User user1 = userService.selectByName(user.getUserName());
        if(user1.getUserPassword().equals(user.getUserPassword())){
            httpSession.setAttribute("USER_SESSION",user1.getUserName());
//            model.addAttribute("menusList", menuList);
            return "/home";
        }else{
            throw new MessageException("账户名或者密码错误");
        }
    }

    //注册
    @RequestMapping("/register.action")
    public String register(Model model,User user) throws MessageException {
        if("".equals(user.getUserName())){throw new MessageException("账户名不能为空");}
        if("".equals(user.getUserPassword())){throw new MessageException("密码不能为空");}
        userService.insertUser(user);
        return "redirect:/login.jsp";
    }
}
