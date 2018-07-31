package cn.peanut.bean.vo;

import java.util.List;

public class MenuVo {
    private String mainMenu;
    private List<String> childMenu;

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public List<String> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<String> childMenu) {
        this.childMenu = childMenu;
    }
}
