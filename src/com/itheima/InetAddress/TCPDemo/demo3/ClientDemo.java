package com.itheima.InetAddress.TCPDemo.demo3;

import java.io.*;
import java.net.Socket;

/**
 * @author lina @date 2022/7/516:37
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        //本地的流，用来读取本地文件。
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\xztjh" +
                "\\Pictures\\backiee-140228.jpg"));
        //写到服务器--------网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int b;


    }
}
