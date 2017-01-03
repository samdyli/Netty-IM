package com.nettyim.config;

import com.google.common.base.Preconditions;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class XmlConfig implements ServerConfig {
    private XmlParser parser;
    private String xmlPath;

    public XmlConfig(XmlParser parser, String xmlPath) {
        this.parser = Preconditions.checkNotNull(parser);
        this.xmlPath = Preconditions.checkNotNull(xmlPath);
    }

    @Override
    public boolean isSSL() {
        return parser.parse(xmlPath).isSSL();
    }

    @Override
    public int serverPort() {
        return parser.parse(xmlPath).serverPort();
    }
}
