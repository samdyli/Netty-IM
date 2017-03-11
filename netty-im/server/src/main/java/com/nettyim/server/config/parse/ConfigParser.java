package com.nettyim.server.config.parse;

import com.nettyim.server.annotation.NeverNull;
import com.nettyim.server.config.context.ServerConfigContext;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface ConfigParser {
    ServerConfigContext parse(@NeverNull String configPath);
}
