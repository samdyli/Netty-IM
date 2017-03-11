package com.nettyim.server.config.context;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public enum ContextEum {
    IS_SSL("server.isssl", "false", 100),
    SERVER_PORT("server.port", "8092", 101);

    String name;
    String defaultValue;
    int index;

    ContextEum(String name, String defaultValue, int index) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.index = index;
    }

    private static ServerConfigContext defaultContext;

    /**
     * Get default ServerConfigContext
     *
     * @return default sever config context
     */
    public static ServerConfigContext getDefaultContext() {
        if (null == defaultContext) {
            defaultContext = new ServerConfigContext();
            defaultContext.isSSL = Boolean.valueOf(IS_SSL.defaultValue);
            defaultContext.port = Integer.parseInt(SERVER_PORT.defaultValue);
        }
        return defaultContext;
    }

    /**
     * TODO:
     * Write default properties to {@code xmlPath} file.
     * {@code $SeverPath/config/default_server_config.xml} is recommended path to write.
     *
     * @param xmlPath, path of xml file
     * @return path are written
     */
    String writeXml(final String xmlPath) {

        return xmlPath;
    }

    /**
     * TODO:
     * Write default properties to {@code propertyPath} file.
     * {@code $SeverPath/config/default_server_config.property} is recommended path to write.
     *
     * @param propertyPath, path of file
     * @return path are written
     */
    String writePropertis(final String propertyPath) {
        return propertyPath;
    }

    public static Map<ContextEum, String> scanMap(Map<String, String> attributeMap) {
        Map<ContextEum, String> retMap = Maps.newHashMap();
        for (ContextEum serverEum : ContextEum.values()) {

            String strVal;
            if (null != (strVal =  attributeMap.get(serverEum.name))) {
                retMap.put(serverEum, strVal);
            }
        }
        return retMap;
    }
}
