package com.nettyim.server.boot;

/**
 * Created by samdyli on 16-12-16.
 */
public class Bootstrap {

     //Server start from here
    public static void main(String[] args) {
        Sever server = new Sever();
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
