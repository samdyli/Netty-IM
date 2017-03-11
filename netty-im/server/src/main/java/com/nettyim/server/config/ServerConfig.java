package com.nettyim.server.config;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface ServerConfig {
    boolean isSSL();
    int serverPort();
}
