/*
package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Contrller
public class AmqpController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/direct")
    @ResponseBody
    public String sendEmail(@RequestParam Map<String,Object> params){
        String msg = params.get("msg").toString();
        rabbitTemplate.convertAndSend("emailExchange","emailRoutingKey",msg);
        System.out.println("发送了消息：" +msg);
        return "OK";
    }
}

*/
