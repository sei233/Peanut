package cn.peanut.bean.vo;

import cn.peanut.bean.po.User;

public class UserVo {
    private User user;
    private Integer role;
    private String userState;

    public String getUserState() {
        return userState;
    }

    public void setUserState() {
        if(user.getUserState()==1){
            this.userState="激活";
        }else if(user.getUserState()==2){
            this.userState="未激活";
        }else{
            this.userState="封禁";
        }
    }

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
