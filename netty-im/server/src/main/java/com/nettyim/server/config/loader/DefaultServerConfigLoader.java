package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ContextEum;
import com.nettyim.server.config.context.ServerConfigContext;
import com.nettyim.server.config.parse.ConfigParser;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DefaultServerConfigLoader extends AbstractServerConfigLoader {
    public DefaultServerConfigLoader() {
        super();
    }

    public DefaultServerConfigLoader(ServerConfigContext defaultCTX) {
        super(defaultCTX);
    }

    public DefaultServerConfigLoader(ServerConfigContext defaultCTX, ConfigParser xmlParser, ConfigParser propertyParse) {
        super(defaultCTX, xmlParser, propertyParse);
    }

    @Override
    public ServerConfigContext load() {
        return ContextEum.getDefaultContext();
    }
}
