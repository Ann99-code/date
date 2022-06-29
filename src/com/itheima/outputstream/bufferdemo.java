package com.itheima.outputstream;

import java.io.*;

/**
 * @author lina @date 2022/4/1415:03
 */
public class bufferdemo {
    public static void main(String[] args) throws IOException {
        //利用缓冲流拷贝文件
        //创建一个字节输入缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\xztjh\\Pictures\\Saved " +
                "Pictures\\103434.jpg"));
        //创建一个字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\date\\c.jpg"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
