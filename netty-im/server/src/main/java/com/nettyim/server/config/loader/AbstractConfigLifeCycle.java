package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ServerConfigContext;

import java.util.List;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class AbstractConfigLifeCycle implements ConfigLifeCycle {
    public void setDefaultContext(ServerConfigContext defaultContext) {
        this.defaultContext = defaultContext;
    }

    public void setLoaders(List<ServerConfigLoader> loaders) {
        this.loaders = loaders;
    }

    ServerConfigContext defaultContext;
    List<ServerConfigLoader> loaders;

    public AbstractConfigLifeCycle(
            ServerConfigContext defaultCTX,
            List<ServerConfigLoader> loaders
    ) {
        this.defaultContext = defaultCTX;
        this.loaders = loaders;
    }

    public AbstractConfigLifeCycle(ServerConfigContext defaultContext) {
        this.defaultContext = defaultContext;
    }

    public AbstractConfigLifeCycle() {

    }

    public AbstractConfigLifeCycle(List<ServerConfigLoader> loaders) {
        this.loaders = loaders;
    }

    @Override
    public ServerConfigContext loadAllConfig(List<ServerConfigLoader> loaders) {
        if (null == defaultContext) {
            defaultContext = new DefaultServerConfigLoader().load();
        }

        ServerConfigContext retContext = defaultContext;

        for (ServerConfigLoader loader : loaders) {
            retContext = loader.load(retContext);
        }
        return retContext;
    }

    @Override
    public ServerConfigContext load() {
        return loadAllConfig(loaders);
    }
}
