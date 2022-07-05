package com.itheima.InetAddress.udpdemo.UdpDemo2;

import java.io.IOException;
import java.net.*;

/**
 * @author lina @date 2022/6/3016:28
 */
public class UdpDemo2Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();


        byte[] bytes = "hello,我的小礼物".getBytes();
        InetAddress inetAddress = InetAddress.getByName("224.0.1.0");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, port);
        ds.send(dp);
        ds.close();
    }
}
