package cn.peanut.controller;

import cn.peanut.bean.po.Menu;
import cn.peanut.bean.po.RoleMenuKey;
import cn.peanut.bean.po.User;
import cn.peanut.bean.po.UserRoleKey;
import cn.peanut.exception.MessageException;
import cn.peanut.service.RoleMenuService;
import cn.peanut.service.UserRoleService;
import cn.peanut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    RoleMenuService roleMenuService;

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

            //通过用户ID获取角色
            UserRoleKey userRole = userRoleService.selectByUserId(user1.getUserId());
            //通过角色ID获取菜单表
            List<RoleMenuKey> roleMenu = roleMenuService.selectByRoleId(userRole.getRoleId());

            model.addAttribute("menusList", roleMenu);
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
