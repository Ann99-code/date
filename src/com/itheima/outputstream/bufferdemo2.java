package com.itheima.outputstream;

import java.io.*;

/**
 * @author lina @date 2022/4/1811:25
 */
public class bufferdemo2 {
    public static void main(String[] args) throws IOException {
        //创建一个字节缓冲输入流
        BufferedInputStream dis = new BufferedInputStream(new FileInputStream("C:\\Users\\xztjh\\Pictures\\粉桃花.jpg"));
        BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream("F:\\date\\d.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = dis.read(bytes) )!= -1) {
            dos.write(bytes, 0, len);
        }
        dis.close();
        dos.close();
    }
}
