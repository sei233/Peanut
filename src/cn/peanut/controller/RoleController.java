package cn.peanut.controller;

import cn.peanut.bean.po.Role;
import cn.peanut.bean.po.RoleMenu;
import cn.peanut.service.MenuService;
import cn.peanut.service.RoleMenuService;
import cn.peanut.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleMenuService roleMenuService;

    @Autowired
    MenuService menuService;

    @Autowired
    RoleService roleService;

    @RequestMapping("/show.action")
    public String showRoleList(Model model) {
        List<RoleMenu> all = roleMenuService.findAll();
        model.addAttribute("roleMenuList", all);
        return "/role_list";
    }
//
//    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
//    public String directAdd(Model model) {
//        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
//        //将pid拆分
//        if (null != (roleMenu)) {
//            String[] menuIdList = roleMenu.getPid().split(",");
//
//            List<MenuVo> menuVoList = new ArrayList<>();
//
//            for (int i = 0; i < menuIdList.length; i++) {
//                MenuVo menuVo = new MenuVo();
//                //通过pid获取主菜单
//                Menu menu = menuService.selectById(Integer.parseInt(menuIdList[i]));
//                menuVo.setMainMenu(menu);
//                //通过pid获取子菜单们
//                List<ChildMenu> childMenu = childMenuService.selectByPid(Integer.parseInt(menuIdList[i]));
//                menuVo.setChildMenu(childMenu);
//                menuVoList.add(menuVo);
//            }
//            model.addAttribute("menusList", menuVoList);
//        }
//        return "/role_add";
//    }
//
//    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
//    public String addRole(String roleName,Integer[] child) {
//        StringBuilder childMenu = new StringBuilder();
//        StringBuilder parent = new StringBuilder();
//        for(int i=0;i<child.length;i++){
//            ChildMenu cM = childMenuService.selectById(child[i]);
//            Integer parentId = cM.getParentId();
//            if(i==0){
//                childMenu.append(child[i]);
//                parent.append(parentId);
//            }else{
//                childMenu.append(","+child[i]);
//                parent.append(","+parentId);
//            }
//        }
//
//        Role role = new Role();
//        role.setRoleName(roleName);
//        roleService.insert(role);
//        Role role1 = roleService.selectByName(roleName);
//        RoleMenu roleMenu = new RoleMenu();
//        roleMenu.setRoleId(role1.getRoleId());
//        roleMenu.setMenuId(childMenu.toString());
//        roleMenu.setPid(parent.toString());
//        roleMenuService.insert(roleMenu);
//        return "/role_add";
//    }
}
