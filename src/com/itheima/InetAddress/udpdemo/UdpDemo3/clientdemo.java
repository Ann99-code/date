package com.itheima.InetAddress.udpdemo.UdpDemo3;

import java.io.IOException;
import java.net.*;

/**
 * @author lina @date 2022/7/114:30
 */
public class clientdemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "小礼物".getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();

    }
}
