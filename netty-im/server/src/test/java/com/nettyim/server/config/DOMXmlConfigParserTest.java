package com.nettyim.server.config;

import com.nettyim.server.config.parse.DOMXmlConfigParser;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DOMXmlConfigParserTest {
    @org.junit.Test
    public void parse() throws Exception {
        String path = Thread.currentThread().getContextClassLoader().getResource("server.xml").getPath();
        System.out.println(path);
        DOMXmlConfigParser parse = new DOMXmlConfigParser();
        parse.parse(path);
    }
}