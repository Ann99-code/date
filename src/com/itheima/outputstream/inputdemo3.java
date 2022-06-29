package com.itheima.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lina @date 2022/4/1311:24
 */
public class inputdemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\xztjh\\Desktop\\mima\\测试.pdf");
        FileOutputStream fos = new FileOutputStream("F:\\date\\ceshi.pdf");
        byte[] bytes = new byte[4000];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
            System.out.println(len);
        }
        fis.close();
        fos.close();

    }
}
