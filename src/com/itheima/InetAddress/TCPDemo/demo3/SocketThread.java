package com.itheima.InetAddress.TCPDemo.demo3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author lina @date 2022/7/1216:39
 */

public class SocketThread implements Runnable {
    private Socket acceptsocket;
    public SocketThread(Socket accept) {
        this.acceptsocket = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
//        bos是把文件写到本地去的，只在try这个范围内有效，所以要在try之外声明
        try {
            BufferedInputStream bis = new BufferedInputStream(acceptsocket.getInputStream());
            //输出到网络上的本地地址，本地的io流，把数据写到本地中，实现永久化存储
            bos = new BufferedOutputStream(new FileOutputStream("F:\\date\\"+ UUID.randomUUID().toString()+".jpg"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptsocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            //跟网络相关的流，只要socket关了，其他的就都关了
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            进行trycatch之前要先判断是否为空
            if (bos!=null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (acceptsocket!=null) {
                try {
                    acceptsocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
