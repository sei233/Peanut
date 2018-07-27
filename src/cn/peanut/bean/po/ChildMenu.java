package cn.peanut.bean.po;

public class ChildMenu {
    private Integer childMenuId;

    private String childMenuName;

    private Integer parentId;

    private String childMenuUrl;

    public Integer getChildMenuId() {
        return childMenuId;
    }

    public void setChildMenuId(Integer childMenuId) {
        this.childMenuId = childMenuId;
    }

    public String getChildMenuName() {
        return childMenuName;
    }

    public void setChildMenuName(String childMenuName) {
        this.childMenuName = childMenuName == null ? null : childMenuName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getChildMenuUrl() {
        return childMenuUrl;
    }

    public void setChildMenuUrl(String childMenuUrl) {
        this.childMenuUrl = childMenuUrl == null ? null : childMenuUrl.trim();
    }
}