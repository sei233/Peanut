package cn.peanut.bean.vo;

import cn.peanut.bean.po.Menu;

import java.util.List;

public class MenuVo {
    private List<Menu> menuList;
    private String roleName;

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
