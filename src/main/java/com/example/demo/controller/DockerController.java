package com.example.demo.controller;

import com.example.demo.enums.MSG_TYPE;
import com.example.demo.handle.MessageServiceContext;
import com.example.demo.service.AsyncService;
import com.example.demo.service.MessageService;
import com.example.demo.vo.MessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DockerController {

    private static final Logger logger = LoggerFactory.getLogger(DockerController.class);
    @Autowired
    private AsyncService asyncService;
    @Autowired
    MessageServiceContext messageServiceContext;

    @RequestMapping("/ececutor")
    public String submit() {

        logger.info("start submit");
        //调用service层的任务
        asyncService.executeAsync();

        logger.info("end submit");

        return "success";

    }

    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping("order")
    public void order(HttpServletRequest request) {
        // 构建一个文本消息
        MessageInfo messageInfo = new MessageInfo(MSG_TYPE.IMAGE.code, "消息内容");
        MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
        // 处理文本消息 消息内容
        // 可以看到文本消息被文本处理类所处理
        messageService.handleMessage(messageInfo);
    }
}
