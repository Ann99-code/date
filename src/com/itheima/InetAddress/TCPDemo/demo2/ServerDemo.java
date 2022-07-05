package com.itheima.InetAddress.TCPDemo.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lina @date 2022/7/415:46
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket accept = ss.accept();

        InputStream is = accept.getInputStream();

        int b;
        while ((b = is.read()) != -1) {
            System.out.println((char) b);
        }

/*        OutputStream os = accept.getOutputStream();
        os.write("你谁啊".getBytes());*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你谁啊");
        bw.newLine();
        bw.flush();

        is.close();
        accept.close();
        bw.close();
        ss.close();
    }
}
