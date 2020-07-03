package com.example.demo.vo;

public class MessageInfo {
    // 消息类型
    private Integer type;
    // 消息内容
    private String content;

    public MessageInfo(int type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
