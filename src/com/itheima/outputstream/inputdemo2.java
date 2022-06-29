package com.itheima.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lina @date 2022/4/1310:23
 */
public class inputdemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("F:\\date\\a.txt");
       /* while (true) {
            int read = fos.read();
            System.out.println(read);
        }*/

        int len;
        while ((len = fos.read()) != -1) {
            System.out.println((char)len);
        }
        fos.close();
    }
}
