package com.nettyim.config;

import com.nettyim.annotation.NeverNull;
import com.nettyim.exception.ConfigException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class DOMXmlParse implements XmlParser {
    @Override
    public
    @NeverNull
    ServerConfig parse(@NeverNull String xmlPath) {
        System.out.println(xmlPath);
        Document doc = getDocument(xmlPath);
        Element element = doc.getDocumentElement();

        return null;
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
}
