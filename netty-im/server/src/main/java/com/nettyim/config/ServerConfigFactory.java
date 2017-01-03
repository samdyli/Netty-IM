package com.nettyim.config;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class ServerConfigFactory {
    private static DefaultConfig defaultConfig;

    private static void loadServerConfig() {
        if (null == defaultConfig) {
            defaultConfig = new DefaultConfig();
        }
    }
    public static ServerConfig getServerConfig() {
        loadServerConfig();
        return defaultConfig;
    }
}
