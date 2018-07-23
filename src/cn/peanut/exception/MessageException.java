package cn.peanut.exception;

public class MessageException extends Exception {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MessageException(String msg) {
        super();
        this.msg = msg;
    }

    private String msg;
}
