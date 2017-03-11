package com.nettyim.server.config;

import java.util.Properties;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DefaultConfig implements ServerConfig {
    boolean isSSL = false;
    int port = 8092;

    static {
       properties = new Properties();

    }

    private static Properties properties;

    @Override
    public boolean isSSL() {
        return isSSL;
    }

    @Override
    public int serverPort() {
        return 80092;
    }

    public static Properties defaultProperties() {
        return properties;
    }
}
