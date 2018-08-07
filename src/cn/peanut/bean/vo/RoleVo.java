package cn.peanut.bean.vo;

import cn.peanut.bean.po.RoleMenu;

public class RoleVo{
    private RoleMenu roleMenu;
    private String menuName;
    private String roleName;

    public RoleMenu getRoleMenu() {
        return roleMenu;
    }

    public void setRoleMenu(RoleMenu roleMenu) {
        this.roleMenu = roleMenu;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
