package com.itheima.InetAddress.udpdemo.UdpDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author lina @date 2022/6/3016:33
 */
public class UdpDemo2Server {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ms.joinGroup(InetAddress.getByName("224.0.1.0"));

        ms.receive(dp);

        System.out.println(new String(dp.getData(),0,dp.getLength()));

        ms.close();
    }
}
