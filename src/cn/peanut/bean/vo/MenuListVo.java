package cn.peanut.bean.vo;

import cn.peanut.bean.po.ChildMenu;
import cn.peanut.bean.po.Menu;

import java.util.List;

public class MenuListVo {
    private List<Menu> mainMenu;
    private List<ChildMenu> childMenu;

    public List<Menu> getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(List<Menu> mainMenu) {
        this.mainMenu = mainMenu;
    }

    public List<ChildMenu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<ChildMenu> childMenu) {
        this.childMenu = childMenu;
    }
}
