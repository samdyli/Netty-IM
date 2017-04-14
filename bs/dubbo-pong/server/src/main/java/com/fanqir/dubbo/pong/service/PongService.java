package com.fanqir.dubbo.pong.service;

import com.fanqir.dubbo.pong.client.Pong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 * Copyright © 2016 Beijing 58ganji spat team. All rights reserved.
 *
 * @author gexiaochuan
 */
public class PongService implements Pong {
    public String pong() {
        Date now = new Date();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);

        return "Pong at " + df.format(now);
    }

    public static void main(String[] args) throws IOException {
        String path = Thread.currentThread()
                .getContextClassLoader()
                .getResource("provider.xml")
                .getPath();

        System.out.println("Path:" + path);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        while (true) {
        }
    }
}
