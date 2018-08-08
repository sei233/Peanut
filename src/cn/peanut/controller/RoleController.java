package cn.peanut.controller;

import cn.peanut.bean.po.Menu;
import cn.peanut.bean.po.Role;
import cn.peanut.bean.po.RoleMenu;
import cn.peanut.bean.po.UserRoleKey;
import cn.peanut.bean.vo.RoleVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.MenuService;
import cn.peanut.service.RoleMenuService;
import cn.peanut.service.RoleService;
import cn.peanut.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
@RequestMapping("/role")
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
public class RoleController {
    @Autowired
    RoleMenuService roleMenuService;

    @Autowired
    MenuService menuService;

    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

    @RequestMapping("/show.action")
    public String showRoleList(Model model) {
        List<RoleVo> roleVoList = new ArrayList<>();
        List<RoleMenu> all = roleMenuService.findAll();
        Iterator iter = all.iterator();

        while (iter.hasNext()) {
            RoleVo roleVo = new RoleVo();
            RoleMenu roleMenu = (RoleMenu) iter.next();

            Role role = roleService.selectById(roleMenu.getRoleId());

            String[] menus = roleMenu.getMenuId().split(",");

            StringBuilder MenuName = new StringBuilder();
            for (int i = 0; i < menus.length; i++) {
                Menu menu = menuService.selectById(Integer.parseInt(menus[i]));
                if (i == 0) {
                    MenuName.append(menu.getMenuName());
                } else {
                    MenuName.append("," + menu.getMenuName());
                }
            }

            roleVo.setRoleMenu(roleMenu);
            roleVo.setRoleName(role.getRoleName());
            roleVo.setMenuName(MenuName.toString());
            roleVoList.add(roleVo);
        }

        model.addAttribute("roleMenuList", roleVoList);
        return "/role_list";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
    public String directAdd(Model model) {
        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        //将pid拆分
        if (null != (roleMenu)) {
            String[] menuIdList = roleMenu.getMenuId().split(",");

            List<Menu> menuVoList = new ArrayList<>();

            for (int i = 0; i < menuIdList.length; i++) {
                Menu menu = menuService.selectById(Integer.parseInt(menuIdList[i]));
                menuVoList.add(menu);
            }
            model.addAttribute("menusList", menuVoList);
        }
        return "/role_add";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
    public String addRole(String roleName, Integer[] child) throws MessageException {
        if ("".equals(roleName) || roleName == null) {throw new MessageException("请输入用户名");}
        if (roleService.selectByName(roleName)!=null) {throw new MessageException("用户名重复");}
        if (child == null) throw new MessageException("请勾选菜单");

        Role role = new Role();
        role.setRoleName(roleName);
        roleService.insert(role);

        Set<Integer> test = new HashSet<Integer>();
        StringBuilder Menu = new StringBuilder();
        for (int i = 0; i < child.length; i++) {
            //获取所勾选的菜单的id，通过id获取menu
            Menu menu = menuService.selectById(child[i]);
            Integer parentId = menu.getParentId();
            Integer menuId = menu.getMenuId();
            List list = new ArrayList(test);
            if (i == 0) {
                Menu.append(parentId + "," + menuId);
            } else if (list.contains(parentId)) {
                Menu.append("," + menuId);
            } else {
                Menu.append("," + parentId + "," + menuId);
            }
            test.add(parentId);
            test.add(menuId);
        }

        Role role1 = roleService.selectByName(roleName);
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleId(role1.getRoleId());
        roleMenu.setMenuId(Menu.toString());
        roleMenuService.insert(roleMenu);

        return "redirect:/role/show.action";
    }

    @RequestMapping(value = "/update.action",method = RequestMethod.GET)
    public String updateRole(Model model,Integer id){
        RoleVo roleVo = new RoleVo();
        Role role = roleService.selectById(id);
        roleVo.setRoleName(role.getRoleName());
        RoleMenu roleMenu = roleMenuService.selectByRoleId(1);
        return "/role_update";
    }

    @RequestMapping("/delete.action")
    public String deleteRole(Integer id) throws MessageException {
        if (id == 1 || id == 2) {
            throw new MessageException("无法删除默认角色");
        }
        UserRoleKey userRoleKey = userRoleService.selectByRoleId(id);
        if (userRoleKey != null) {
            throw new MessageException("有用户在使用该角色");
        }
        roleMenuService.deleteById(id);
        roleService.deleteById(id);
        return "redirect:/role/show.action";
    }
}
