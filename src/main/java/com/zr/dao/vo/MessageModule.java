package com.zr.dao.vo;

public class MessageModule {
    private Integer result=1;
    private String MessageResult="登陆操作成功";

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMessageResult() {
        return MessageResult;
    }

    public void setMessageResult(String messageResult) {
        MessageResult = messageResult;
    }
}
