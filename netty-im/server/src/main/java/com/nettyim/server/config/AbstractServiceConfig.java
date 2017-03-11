package com.nettyim.server.config;

import com.nettyim.server.config.context.ServerConfigContext;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public abstract class AbstractServiceConfig implements ServerConfig {
    private ServerConfigContext configContext;

    public ServerConfigContext getConfigContext() {
        if (null == configContext) {
            configContext = new ServerConfigContext();
            configContext.isSSL = isSSL();
            configContext.port = serverPort();
        }
        return configContext;
    }
}
