package cn.peanut.controller;

import cn.peanut.bean.po.RoleMenu;
import cn.peanut.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleMenuService roleMenuService;

    @RequestMapping("/show.action")
    public String showRoleList(Model model){
        List<RoleMenu> all = roleMenuService.findAll();
        model.addAttribute("roleMenuList", all);
        return "/role_list";
    }

    @RequestMapping(value = "/add.action",method = RequestMethod.GET)
    public String directAdd(){
        return "/role_add";
    }

    @RequestMapping(value = "/add.action",method = RequestMethod.POST)
    public String updateRole(){

        return "/role_add";
    }
}
