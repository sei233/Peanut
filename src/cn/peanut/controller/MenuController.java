package cn.peanut.controller;

import cn.peanut.bean.po.Menu;
import cn.peanut.bean.po.RoleMenu;
import cn.peanut.exception.MessageException;
import cn.peanut.service.MenuService;
import cn.peanut.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/menu")
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
public class MenuController {

    @Autowired
    MenuService menuService;

    @Autowired
    RoleMenuService roleMenuService;

    @RequestMapping("/show.action")
    public String showMenuList(Model model) {
        List<Menu> menuListVo = menuService.findAll();
        model.addAttribute("menusList", menuListVo);
        return "/menu_list";
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.GET)
    public String directUpdate1(Model model, Integer menuId) {
        Menu menu = menuService.selectById(menuId);
        model.addAttribute("menu", menu);
        return "/menu_update";
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.POST)
    public String updateMenu(Menu menu) throws MessageException {
        if ("".equals(menu.getMenuName())
                && "".equals(menu.getMenuUrl())
                && menu.getParentId() == null) {
            throw new MessageException("提交菜单不能为空");
        }
        menuService.update(menu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
    public String directAdd() {
        return "/menu_add";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
    public String addMenu(Menu menu) throws MessageException {
        if ("".equals(menu.getMenuName())) {
            throw new MessageException("菜单名不能为空");
        }

        menuService.insert(menu);

        Menu menu1 = menuService.selectByName(menu.getMenuName());

        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        String pid = roleMenu.getMenuId();
        roleMenu.setMenuId(pid + "," + menu1.getMenuId());

        roleMenuService.update(roleMenu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping("/delete.action")
    public String deleteMenu(Menu menu) throws MessageException {
        menuService.deleteMenuById(menu.getMenuId());


        List<RoleMenu> roleMenuList = roleMenuService.findAll();
        Iterator iter = roleMenuList.iterator();

        while (iter.hasNext()) {
            RoleMenu roleMenu = (RoleMenu)iter.next();
            String pid = roleMenu.getMenuId();
            String pid1 = pid.replaceAll("," + menu.getMenuId(), "");
            roleMenu.setMenuId(pid1);
            roleMenuService.update(roleMenu);
        }
        return "redirect:/menu/show.action";
    }

}
