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
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/menu")
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
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

    @RequestMapping(value = "/update1.action",method = RequestMethod.GET)
    public String directUpdate1(Model model,Integer menuId){
        Menu menu = menuService.selectById(menuId);
        model.addAttribute("menu",menu);
        return "/menu_update";
    }

    @RequestMapping(value = "/update1.action",method = RequestMethod.POST)
    public String updateMenu(Menu menu) throws MessageException {
        if("".equals(menu.getMenuName())
                &&"".equals(menu.getMenuUrl())){
            throw new MessageException("提交菜单不能为空");
        }
        menuService.update(menu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping(value = "/update2.action",method = RequestMethod.GET)
    public String directUpdate2(Model model,Integer childMenuId){
        ChildMenu childMenu = childMenuService.selectById(childMenuId);
        model.addAttribute("childMenu",childMenu);
        return "/childmenu_update";
    }

    @RequestMapping(value = "/update2.action",method = RequestMethod.POST)
    public String updateChildMenu(ChildMenu menu ) throws MessageException {
        if("".equals(menu.getChildMenuName())
                &&menu.getParentId()==null
                &&"".equals(menu.getChildMenuUrl())){
            throw new MessageException("提交子菜单不能为空");
        }
        childMenuService.update(menu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping(value = "/add1.action",method = RequestMethod.GET)
    public String directAdd(){
        return "/menu_add";
    }

    @RequestMapping(value = "/add1.action",method = RequestMethod.POST)
    public String addMenu(Menu menu) throws MessageException {
        if("".equals(menu.getMenuName()))
        {  throw new MessageException("菜单名不能为空");}

        menuService.insert(menu);

        Menu menu1 = menuService.selectByName(menu.getMenuName());


        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        String pid = roleMenu.getPid();
        roleMenu.setPid(pid + "," + menu1.getMenuId());

        roleMenuService.update(roleMenu);
        return "redirect:/menu/show.action";
    }

    @RequestMapping(value = "/add2.action",method = RequestMethod.GET)
    public String directAdd2(){
        return "/childmenu_add";
    }

    @RequestMapping(value = "/add2.action",method = RequestMethod.POST)
    public String addChildMenu(ChildMenu childMenu) throws MessageException {
        //获取所有的PID(管理员)
        if("".equals(childMenu.getChildMenuName()))
            throw new MessageException("子菜单名不能为空");

        if(childMenu.getParentId()==null)
            throw new MessageException("PID不能为空");

        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        String pid = roleMenu.getPid();

        if(!pid.contains(childMenu.getParentId().toString())){
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
