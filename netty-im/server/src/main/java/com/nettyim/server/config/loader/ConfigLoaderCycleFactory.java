package com.nettyim.server.config.loader;

import java.util.Arrays;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class ConfigLoaderCycleFactory {
    public static ConfigLifeCycle defaultLifeCycle() {

        ServerConfigLoader[] loaders = {
            new EnvSeverConfigLoader(),
        };

        return new DefaultConfigLifeCycle(Arrays.asList(loaders));
    }
}
