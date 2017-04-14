package com.fanqir.dubbo.ping.controller;

import com.fanqir.dubbo.pong.client.Pong;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2016 Beijing 58ganji spat team. All rights reserved.
 *
 * @author gexiaochuan
 */


@RestController
public class PingController {
    @RequestMapping("/ping")
    public String getPong() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ping.xml");

        Pong pong = (Pong) context.getBean("pongService");
        return pong.pong();
    }
}
