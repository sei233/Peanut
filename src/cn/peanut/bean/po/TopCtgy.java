package cn.peanut.bean.po;

public class TopCtgy {
    private Integer topCtgyId;

    private String topCtgyName;

    public Integer getTopCtgyId() {
        return topCtgyId;
    }

    public void setTopCtgyId(Integer topCtgyId) {
        this.topCtgyId = topCtgyId;
    }

    public String getTopCtgyName() {
        return topCtgyName;
    }

    public void setTopCtgyName(String topCtgyName) {
        this.topCtgyName = topCtgyName == null ? null : topCtgyName.trim();
    }
}