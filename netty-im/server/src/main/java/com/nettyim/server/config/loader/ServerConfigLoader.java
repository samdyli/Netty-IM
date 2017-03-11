package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ContextEum;
import com.nettyim.server.config.context.ServerConfigContext;

import java.util.Set;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface ServerConfigLoader {
    ServerConfigContext load();
    ServerConfigContext load(ServerConfigContext defaultCTX);
    ServerConfigContext loadXml(String xmlPath);
    ServerConfigContext loadProperty(String propertyPath);

    Set<ContextEum> loadAttributeIndexs();
}
