package com.nettyim.server.config.loader;

import com.nettyim.server.config.context.ContextEum;
import com.nettyim.server.config.context.ServerConfigContext;
import com.nettyim.server.config.parse.ConfigParser;
import com.nettyim.server.config.parse.DOMXmlConfigParser;
import com.nettyim.server.config.parse.PropertyParse;

import java.util.Set;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public abstract class AbstractServerConfigLoader implements ServerConfigLoader {
    ServerConfigContext context;
    ConfigParser xmlParser;
    ConfigParser propertyParser;
    Set<ContextEum> attributes;

    @Override
    public ServerConfigContext load(final ServerConfigContext defaultCTX) {
        return defaultCTX;
    }

    public AbstractServerConfigLoader(ServerConfigContext defaultCTX) {
        this.context = defaultCTX;
        xmlParser = new DOMXmlConfigParser();
        propertyParser = new PropertyParse();
    }

    public AbstractServerConfigLoader(ServerConfigContext defaultCTX, ConfigParser xmlParser, ConfigParser propertyParse) {
        this.context = defaultCTX;
        this.xmlParser = xmlParser;
        this.propertyParser = propertyParse;
    }

    public AbstractServerConfigLoader() {

    }

    @Override
    public ServerConfigContext load() {
        return context;
    }

    @Override
    public ServerConfigContext loadXml(String xmlPath) {
        return xmlParser.parse(xmlPath);
    }

    @Override
    public ServerConfigContext loadProperty(String propertyPath) {
        return propertyParser.parse(propertyPath);
    }

    @Override
    public Set<ContextEum> loadAttributeIndexs() {
        return attributes;
    }
}
