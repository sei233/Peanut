package cn.peanut.controller;

import cn.peanut.bean.po.*;
import cn.peanut.bean.vo.UserVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/user")
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    MenuService menuService;

    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    RoleMenuService roleMenuService;

    @RequestMapping("/show.action")
    public String showUserList(Model model) {
        List<User> userList = userService.findAll();
        Iterator iter = userList.iterator();
        List<UserVo> userVoList = new ArrayList<>();

        while (iter.hasNext()) {
            User user = (User) iter.next();
            UserRoleKey userRole = userRoleService.selectByUserId(user.getUserId());
            UserVo userVo = new UserVo();
            userVo.setUser(user);
            userVo.setRole(userRole.getRoleId());
            userVo.setUserState();
            userVoList.add(userVo);
        }

        model.addAttribute("usersList", userVoList);
        return "/user_list";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
    public String directAdd() {
        return "/user_add";
    }

    @RequestMapping(value = "/add.action", method = RequestMethod.POST)
    public String addUser(User user) throws MessageException {
        if ("".equals(user.getUserName())) {
            throw new MessageException("账户名不能为空");
        }
        if ("".equals(user.getUserPassword())) {
            throw new MessageException("密码不能为空");
        }
        if (userService.selectByName(user.getUserName())!=null) {
            throw new MessageException("用户名重复");
        }
        user.setUserState((byte) 2);

        userService.insertUser(user);

        User user1 = userService.selectByName(user.getUserName());
        UserRoleKey userRole = new UserRoleKey();
        userRole.setUserId(user1.getUserId());
        userRole.setRoleId(2);
        userRoleService.insert(userRole);
        return "redirect:/user/show.action";
    }

    @RequestMapping("/delete.action")
    public String deleteUser(Integer id) throws MessageException {
        userRoleService.deleteById(id);
        userService.deleteUserById(id);
        return "redirect:/user/show.action";
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.GET)
    public String updateUser(Model model, Integer id) throws MessageException {
        User user = userService.selectById(id);
        UserVo userVo = new UserVo();
        userVo.setUser(user);
        userVo.setUserState();
        UserRoleKey userRoleKey = userRoleService.selectByUserId(user.getUserId());
        userVo.setRole(userRoleKey.getRoleId());
        model.addAttribute("userVo", userVo);
        return "/user_update";
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.POST)
    public String updateUser(UserVo userVo) throws MessageException {
        if ("".equals(userVo.getUser().getUserName())
                && "".equals(userVo.getUser().getUserPassword())
                && userVo.getUser().getUserState() == null) {
            throw new MessageException("提交用户不能为空");
        }

        if(userVo.getRole() != null && roleService.selectById(userVo.getRole())==null)
            throw new MessageException("该角色不存在");

        userService.updateUser(userVo.getUser());

        if (userVo.getRole() != null) {
            UserRoleKey userRoleKey = new UserRoleKey();
            userRoleKey.setUserId(userVo.getUser().getUserId());
            userRoleKey.setRoleId(userVo.getRole());
            userRoleService.updateRoleId(userRoleKey);
        }
        return "redirect:/user/show.action";
    }

    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String login() {
        return "redirect:/login.jsp";
    }

    @RequestMapping(value = "/home.action", method = RequestMethod.GET)
    public String home() {
        return "/welcome";
    }

    //登录
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(Model model, User user, HttpSession httpSession) throws MessageException {
        httpSession.setAttribute("menusList", null);
        if ("".equals(user.getUserPassword())) {
            throw new MessageException("密码不能为空");
        }
        if (userService.selectByName(user.getUserName()) == null) {
            throw new MessageException("账号不存在");
        }
        User user1 = userService.selectByName(user.getUserName());
        if (user1.getUserState() == null || user1.getUserState() != 1) {
            throw new MessageException("账号未被激活或是被封禁");
        }
        if (user1.getUserPassword().equals(user.getUserPassword())) {
            httpSession.setAttribute("USER_SESSION", user1.getUserName());

            //通过用户ID获取角色
            UserRoleKey userRole = userRoleService.selectByUserId(user1.getUserId());
            //通过角色ID获取菜单表PID
            if (null != (userRole)) {
                RoleMenu roleMenu = roleMenuService.selectByRoleId(userRole.getRoleId());
                //将pid拆分
                if (null != (roleMenu)) {
                    String[] menuIdList = roleMenu.getMenuId().split(",");

                    List<Menu> menuVoList = new ArrayList<>();

                    for(int i=0;i<menuIdList.length;i++){
                        Menu menu = menuService.selectById(Integer.parseInt(menuIdList[i]));
                        menuVoList.add(menu);
                    }
//                    List<MenuVo> menuVoList = new ArrayList<>();
//
//                    for (int i = 0; i < menuIdList.length; i++) {
//                        MenuVo menuVo = new MenuVo();
//                        Menu menu = menuService.selectById(Integer.parseInt(menuIdList[i]));
//
//                        //如果pid为0就是主菜单
//                        if (menu.getParentId() == 0) {
//                            List<Menu> childMenu = new ArrayList<>();
//                            menuVo.setMainMenu(menu);
//                            menuVo.setChildMenu(childMenu);
//                            menuVoList.add(menuVo);
//                        }
//
//                        for (int j = 0; j < menuIdList.length; j++) {
//                            Menu childmenu = menuService.selectById(Integer.parseInt(menuIdList[j]));
//                            if (childmenu.getParentId() != 0) {
//                                if (childmenu.getParentId().equals(menu.getMenuId())) {
//                                    menuVo.getChildMenu().add(childmenu);
//                                }
//                            }
//                        }
//                    }

                    httpSession.setAttribute("menusList", menuVoList);
                }
            }
            return "/home";
        } else {
            throw new MessageException("账户名或者密码错误");
        }
    }

    //注册
    @RequestMapping("/register.action")
    public String register(Model model, User user) throws MessageException {
        if ("".equals(user.getUserName())) {
            throw new MessageException("账户名不能为空");
        }
        if ("".equals(user.getUserPassword())) {
            throw new MessageException("密码不能为空");
        }
        user.setUserState((byte) 2);

        userService.insertUser(user);

        User user1 = userService.selectByName(user.getUserName());
        UserRoleKey userRole = new UserRoleKey();
        userRole.setUserId(user1.getUserId());
        userRole.setRoleId(2);
        userRoleService.insert(userRole);

        return "redirect:/login.jsp";
    }
}
