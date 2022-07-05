package com.itheima.InetAddress.udpdemo.udpdemo;

import java.io.IOException;
import java.net.*;

/**
 * @author lina @date 2022/6/3014:16
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            if (new String(bytes, 0, bytes.length).equals("886")) {
                break;
            }
            System.out.println(new String(bytes, 0, bytes.length));
        }


    }
}
