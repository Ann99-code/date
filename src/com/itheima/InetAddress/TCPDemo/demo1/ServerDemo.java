package com.itheima.InetAddress.TCPDemo.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lina @date 2022/7/116:06
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        1、创建serversocket对象
        ServerSocket ss = new ServerSocket(10000);
//        2、等待客户端连接
        System.out.println(1111111111);
        Socket accept = ss.accept();
        System.out.println(22222222);
//        3、获得输入流对象
        InputStream is = accept.getInputStream();
        int b;
        while ((b=is.read())!=-1) {
            System.out.print((char)b);
        }

//        4、释放资源
        is.close();
        ss.close();
    }
}
