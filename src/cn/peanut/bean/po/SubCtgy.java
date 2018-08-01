package cn.peanut.bean.po;

public class SubCtgy {
    private Integer subCtgyId;

    private String subCtgyName;

    public Integer getSubCtgyId() {
        return subCtgyId;
    }

    public void setSubCtgyId(Integer subCtgyId) {
        this.subCtgyId = subCtgyId;
    }

    public String getSubCtgyName() {
        return subCtgyName;
    }

    public void setSubCtgyName(String subCtgyName) {
        this.subCtgyName = subCtgyName == null ? null : subCtgyName.trim();
    }
}