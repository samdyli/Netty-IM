package com.nettyim.server.config.parse;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public interface Function<F,T> {
    T apply(F input);
}
