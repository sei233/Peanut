package cn.peanut.controller;

import cn.peanut.bean.po.ChildMenu;
import cn.peanut.bean.po.Menu;
import cn.peanut.bean.po.RoleMenu;
import cn.peanut.bean.vo.MenuListVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.ChildMenuService;
import cn.peanut.service.MenuService;
import cn.peanut.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @Autowired
    ChildMenuService childMenuService;

    @Autowired
    RoleMenuService roleMenuService;

    @RequestMapping("/show.action")
    public String showMenuList(Model model){
        List<Menu> menu =  menuService.findAll();
        List<ChildMenu> childMenu = childMenuService.findAll();
        MenuListVo menuListVo = new MenuListVo();
        menuListVo.setMainMenu(menu);
        menuListVo.setChildMenu(childMenu);
        model.addAttribute("menusList",menuListVo);
        return "/menu_list";
    }

    @RequestMapping("/update1.action")
    public String updateMenu(Menu menu){

        return "/menu_update1";
    }

    @RequestMapping("/update2.action")
    public String updateMenu(ChildMenu menu){

        return "/menu_update2";
    }

    @RequestMapping(value = "/add1.action",method = RequestMethod.GET)
    public String directAdd(){
        return "/menu_add";
    }

    @RequestMapping(value = "/add1.action",method = RequestMethod.POST)
    public String addMenu(Menu menu){
        if(menu.getMenuName()!=null&&!"".equals(menu.getMenuName()))
            menuService.insert(menu);

        Menu menu1 = menuService.selectByName(menu.getMenuName());


        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        String pid = roleMenu.getPid();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pid).append(",").append(menu1.getMenuId());
        roleMenu.setPid(stringBuilder.toString());

        roleMenuService.update(roleMenu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping(value = "/add2.action",method = RequestMethod.GET)
    public String directAdd2(){
        return "/childmenu_add";
    }

    @RequestMapping(value = "/add2.action",method = RequestMethod.POST)
    public String addChildMenu(ChildMenu childMenu) throws MessageException {
        List<ChildMenu> childMenus = childMenuService.selectByPid(childMenu.getParentId());
        if(childMenus.size()==0){
            throw new MessageException("找不到PID");}
        if(childMenu.getChildMenuName()!=null&&!"".equals(childMenu.getChildMenuName()))
            childMenuService.insert(childMenu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping("/delete1.action")
    public String deleteMenu(Menu menu) throws MessageException {
        List<ChildMenu> childMenus = childMenuService.selectByPid(menu.getMenuId());
        if(childMenus.size()!=0){
            throw new MessageException("请先删除子菜单");}
        menuService.deleteMenuById(menu.getMenuId());

        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        String pid = roleMenu.getPid();
        String pid1 = pid.replaceAll(","+menu.getMenuId(),"");
        roleMenu.setPid(pid1);

        roleMenuService.update(roleMenu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping("/delete2.action")
    public String deleteMenu(ChildMenu childMenu){
        childMenuService.deleteMenuById(childMenu.getChildMenuId());
        return "redirect:/menu/show.action";
    }
}
