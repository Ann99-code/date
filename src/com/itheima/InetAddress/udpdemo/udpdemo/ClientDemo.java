package com.itheima.InetAddress.udpdemo.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author lina @date 2022/6/3014:15
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals("886")) {
                break;
            }
            byte[] bytes1 = s.getBytes();
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            int port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes1,bytes1.length,byName,10000);
            ds.send(dp);
        }
        ds.close();
    }
    }

