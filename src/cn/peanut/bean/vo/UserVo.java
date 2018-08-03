package cn.peanut.bean.vo;

import cn.peanut.bean.po.User;

public class UserVo {
    private User user;
    private Integer role;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
