package com.itheima.InetAddress.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author lina @date 2022/6/2916:48
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//          1、找码头
        DatagramSocket ds = new DatagramSocket(10000);

//        2、创建一个新箱子
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
//        3、接收礼物，把礼物放到新的箱子里。
        ds.receive(dp);
//        4、从新的箱子里拆出礼物
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));

//        拿完走羊
        ds.close();
    }
}
