package com.nettyim.server.exception;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */

// unchecked exception
public class ConfigException extends RuntimeException{
    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigException(Throwable cause) {
        super(cause);
    }
}
