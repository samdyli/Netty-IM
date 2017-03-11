package com.nettyim.server.core.utils;

import java.io.File;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DefaultServerPath implements ServerPath {
    private final String ROOT;

    public DefaultServerPath(String root) {
        this.ROOT = root;
    }

    public String config() {
        return ROOT + File.pathSeparator + "config";
    }

    public String lib() {
        return ROOT + File.pathSeparator + "lib";
    }

    public String bin() {
        return ROOT + File.pathSeparator + "bin";
    }

    public String boot() {
        return ROOT + File.pathSeparator + "boot";
    }
}
