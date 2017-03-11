package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ServerConfigContext;

import java.util.List;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface ConfigLifeCycle {
    ServerConfigContext loadAllConfig(List<ServerConfigLoader> loaders);
    ServerConfigContext load();
}
