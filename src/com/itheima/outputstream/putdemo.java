package com.itheima.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lina @date 2022/4/1310:54
 */
public class putdemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\date\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\date\\b.txt");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
            System.out.println(len);
        }
        fos.close();
        fis.close();
    }
}
