package com.nettyim.server.core.utils;


import java.io.File;

import me.imyun.message.Message;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class Paths {
    public static String getCurrentPath() {
        String path = System.getProperty("serviceframe.config.path");
        System.out.println("serviceframe.config.path:" + path);
        if(path == null || path.equalsIgnoreCase("")) {
            Class caller = getCaller();
            if(caller == null) {
                caller = Paths.class;
            }

            path = getCurrentPath(caller);
        }

        System.out.println("utility path getCurrentPath:" + path);
        return path;
    }

    public static Class<?> getCaller() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        System.out.println("stack length:" + stack.length);
        if(stack.length < 3) {
            return Paths.class;
        } else {
            String className = stack[2].getClassName();
            System.out.println("getCaller class name:" + className);

            try {
                return Class.forName(className);
            } catch (ClassNotFoundException var3) {
                var3.printStackTrace();
                return null;
            }
        }
    }

    public static String getCurrentPath(Class<?> cls) {
        String path = cls.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("file:/", "");
        path = path.replaceAll("!/", "");
        if(path.lastIndexOf(File.separator) >= 0) {
            path = path.substring(0, path.lastIndexOf(File.separator));
        }

        if(path.substring(0, 1).equalsIgnoreCase("/")) {
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.indexOf("window") >= 0) {
                path = path.substring(1);
            }
        }

        return path;
    }

    public static void main(String[] args) {
        System.out.println(getCurrentPath());
        System.out.println(getCurrentPath(Message.class));
    }
}
