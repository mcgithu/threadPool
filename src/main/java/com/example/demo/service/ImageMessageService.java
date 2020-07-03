package com.example.demo.service;

import com.example.demo.enums.MSG_TYPE;
import com.example.demo.handle.MsgTypeHandler;
import com.example.demo.vo.MessageInfo;
import org.springframework.stereotype.Service;

@Service
@MsgTypeHandler(value = MSG_TYPE.IMAGE)
public class ImageMessageService implements MessageService {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理图片消息 " + messageInfo.getContent());
    }
}
