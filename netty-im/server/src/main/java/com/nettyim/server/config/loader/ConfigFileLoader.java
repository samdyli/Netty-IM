package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ServerConfigContext;
import com.nettyim.server.config.parse.ConfigParser;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class ConfigFileLoader extends AbstractServerConfigLoader {
    public ConfigFileLoader(ServerConfigContext defaultCTX) {
        super(defaultCTX);
    }

    public ConfigFileLoader(ServerConfigContext defaultCTX, ConfigParser xmlParser, ConfigParser propertyParse) {
        super(defaultCTX, xmlParser, propertyParse);
    }

    public ConfigFileLoader() {
    }

    @Override
    public ServerConfigContext load() {
        xmlParser.parse("");
        return super.load();
    }
}
