package cn.peanut.bean.vo;

import cn.peanut.bean.po.Menu;

import java.util.List;

public class MenuVo {
    private Menu mainMenu;
    private List<Menu> childMenu;

    public Menu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public List<Menu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }
}
