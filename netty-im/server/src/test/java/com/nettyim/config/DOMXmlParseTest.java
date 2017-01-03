package com.nettyim.config;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DOMXmlParseTest {
    @org.junit.Test
    public void parse() throws Exception {
        String path = Thread.currentThread().getContextClassLoader().getResource("server.xml").getPath();
        System.out.println(path);
        DOMXmlParse parse = new DOMXmlParse();
        parse.parse(path);
    }
}