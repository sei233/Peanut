package cn.peanut.controller;

import cn.peanut.bean.po.RoleMenu;
import cn.peanut.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
