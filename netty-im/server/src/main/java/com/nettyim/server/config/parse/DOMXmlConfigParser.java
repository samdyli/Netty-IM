package com.nettyim.server.config.parse;

import com.google.common.collect.Maps;

import com.nettyim.server.annotation.NeverNull;
import com.nettyim.server.exception.ConfigException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DOMXmlConfigParser extends XmlConfigParser {
    private final boolean ignoreRootElement;
    private static final String separator = ".";

    public DOMXmlConfigParser(boolean ignoreRootElement) {
        this.ignoreRootElement = ignoreRootElement;
    }

    public DOMXmlConfigParser() {
        ignoreRootElement = false;
    }

    @Override
    Map<String, String> getAttributes(@NeverNull String configPath) {
        Document doc = getDocument(configPath);
        Map<String, String> retMap = walkDocument(doc);
        return retMap;
    }

    private
    @NeverNull
    Document getDocument(@NeverNull String xmlPath) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
            return docBuilder.parse(new File(xmlPath));
        } catch (Exception e) {
            throw new ConfigException(e);
        }
    }

    private Map walkDocument(@NeverNull Document doc) {
        Map maps = Maps.newHashMap();
        maps.putAll(
                walkNodes(doc, "")
        );

        return maps;
    }

    public Map<String, String> walkNodes(Node input, @NeverNull String prefix) {
        Map<String, String> retMap = Maps.newHashMap();

        if (input.hasAttributes()) {
            NamedNodeMap nnm = input.getAttributes();

            // process "id" attribute
            Node idNode;
            if (null != (idNode = nnm.getNamedItem("id"))) {
                prefix += idNode.getNodeValue();
            }

            for (int i = 0; i < nnm.getLength(); i++) {
                Node curNode = nnm.item(i);
                retMap.put(
                        prefix + separator + curNode.getNodeName(),
                        curNode.getNodeValue()
                );
            }
        }

        if ( 0 == input.getChildNodes().getLength()) {
            retMap.put(
                    prefix + separator + input.getNodeName(),
                    input.getNodeValue()
            );
            return retMap;
        }

        NodeList childNodes = input.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node curChildNode = childNodes.item(i);
            retMap.putAll(walkNodes(curChildNode, prefix));
        }
        return retMap;
    }
}
