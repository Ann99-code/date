package com.itheima.InetAddress.client;

import java.io.IOException;
import java.net.*;

/**
 * @author lina @date 2022/6/2916:34
 */
public class clientdemo {
    public static void main(String[] args) throws IOException {
//        1、找码头
        DatagramSocket ds = new DatagramSocket();
//        2、打包礼物
        String s = "送给自己的礼物";
        byte[] bytes = s.getBytes();
        InetAddress lina = InetAddress.getByName("DESKTOP-OL69UHD");
        int port=10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,lina,port);
//        3、由码头发出包裹
        ds.send(dp);

//        4、付钱走羊
        ds.close();
    }
}
