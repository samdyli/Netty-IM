package com.nettyim.server.config.context;

import java.util.Iterator;
import java.util.Map;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class ServerConfigContext {
    public boolean isSSL;
    public int port;

    public ServerConfigContext(ServerConfigContext context) {
        this.isSSL = context.isSSL;
        this.port = context.port;
    }

    public ServerConfigContext() {

    }

    public void setAttribute(ContextEum eum, String value) {
        switch (eum) {
            case IS_SSL:
                this.isSSL = Boolean.valueOf(value);
                break;
            case SERVER_PORT:
                this.port = Integer.valueOf(value);
                break;
        }
    }

    public void setAttribute(Map<ContextEum, String> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            ContextEum eum = (ContextEum) iterator.next();
            setAttribute(eum, map.get(eum));
        }
    }
}
