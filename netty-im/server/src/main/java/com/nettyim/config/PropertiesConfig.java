package com.nettyim.config;

import java.util.Properties;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class PropertiesConfig extends Properties implements ServerConfig{

    public static void load(String propertiesPath) {
        Properties properties = new Properties() ;
    }

    @Override
    public boolean isSSL() {
        return false;
    }

    @Override
    public int serverPort() {
        return 0;
    }
}
