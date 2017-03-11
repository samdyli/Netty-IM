package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ServerConfigContext;

import java.util.List;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DefaultConfigLifeCycle extends AbstractConfigLifeCycle{
    public DefaultConfigLifeCycle(ServerConfigContext defaultCTX, List<ServerConfigLoader> loaders) {
        super(defaultCTX, loaders);
    }

    public DefaultConfigLifeCycle(ServerConfigContext defaultContext) {
        super(defaultContext);
    }

    public DefaultConfigLifeCycle() {
        super();
    }

    public DefaultConfigLifeCycle(List<ServerConfigLoader> loaders) {
       super(loaders);
    }
}
