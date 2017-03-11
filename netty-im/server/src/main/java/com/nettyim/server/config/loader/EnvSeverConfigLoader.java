package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ContextEum;
import com.nettyim.server.config.context.ServerConfigContext;
import com.nettyim.server.config.parse.ConfigParser;

import java.util.Map;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class EnvSeverConfigLoader extends AbstractServerConfigLoader {
    public EnvSeverConfigLoader(ServerConfigContext defaultCTX) {
        super(defaultCTX);
    }

    public EnvSeverConfigLoader(ServerConfigContext defaultCTX, ConfigParser xmlParser, ConfigParser propertyParse) {
        super(defaultCTX, xmlParser, propertyParse);
    }

    public EnvSeverConfigLoader() {

    }

    @Override
    public ServerConfigContext load() {
        ServerConfigContext context = super.load();
        Map attributeMap = ContextEum.scanMap(System.getenv());
        context.setAttribute(attributeMap);
        attributes = attributeMap.entrySet();
        return context;
    }
}
