package com.nettyim.config;

import com.nettyim.annotation.NeverNull;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface Parse {
    ServerConfig parse(@NeverNull String xmlPath);
}
