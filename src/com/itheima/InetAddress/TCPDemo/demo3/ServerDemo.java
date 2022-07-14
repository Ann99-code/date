package com.itheima.InetAddress.TCPDemo.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author lina @date 2022/7/516:37
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            Socket accept = ss.accept();
            SocketThread socketThread = new SocketThread(accept);
            Thread thread = new Thread(socketThread);
            thread.start();
        }
//        ss.close();
    }
}
