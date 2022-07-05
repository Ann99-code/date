package com.itheima.InetAddress.TCPDemo.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author lina @date 2022/7/116:05
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
//      1、创建一个Socket对象
        Socket s = new Socket("127.0.0.1", 10000);
//        2、获取一个io流开始写数据
        OutputStream os = s.getOutputStream();
        os.write("hello".getBytes());
//        3、关闭流
        os.close();
        s.close();
    }
}
