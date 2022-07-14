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
        while ((b = bis.read()) != -1) {
            bos.write((char) b);//通过网络写到服务器中,一边读，一边写
        }
        socket.shutdownOutput();//写完了之后给服务器一个结束标志，告诉服务器，文件已经传输完毕
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bis.close();
        socket.close();


    }
}
