package com.nettyim.server.config.parse;

import com.nettyim.server.annotation.NeverNull;
import com.nettyim.server.config.context.ContextEum;
import com.nettyim.server.config.context.ServerConfigContext;

import java.io.File;
import java.util.Map;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public abstract class AbstractConfigParser implements ConfigParser {
    @Override
    public ServerConfigContext parse(@NeverNull String configPath) {
        checkFileExist(configPath);

        Map<ContextEum, String> attributes = getAttributes(getAttributes(configPath));

        ServerConfigContext context = new ServerConfigContext();
        context.setAttribute(attributes);
        return context;
    }

    private Map<ContextEum, String> getAttributes(@NeverNull Map<String, String> attributesMap) {
        return ContextEum.scanMap(attributesMap);
    }

    abstract Map<String, String> getAttributes(@NeverNull String configPath);

    void checkFileExist(@NeverNull String configPath) {
        if (! new File(configPath).isFile()) {
            throw new IllegalStateException("Fatal state: " + configPath + "is not exist");
        }
    }
}
