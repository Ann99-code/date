package com.itheima.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lina @date 2022/4/1020:37
 */
public class inputdemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("F:\\date\\a.txt");
        int read = fos.read();
        System.out.println((char)read);
        fos.close();
    }
}
