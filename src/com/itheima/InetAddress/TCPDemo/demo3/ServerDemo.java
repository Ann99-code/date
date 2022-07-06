package com.itheima.InetAddress.TCPDemo.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lina @date 2022/7/516:37
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        //网络中的流，从客户端读取数据用的
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //输出到网络上的本地地址，本地的io流，把数据写到本地中，实现永久化存储
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("date\\com\\itheima" +
                "\\InetAddress\\TCPDemo\\demo3\\copy.jpg"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        //跟网络相关的流，只要socket关了，其他的就都关了
        bos.close();
        bw.flush();
        accept.close();
    }
}
