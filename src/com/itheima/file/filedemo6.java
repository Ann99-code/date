package com.itheima.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lina @date 2022/3/1011:14
 */
public class filedemo6 {
    public static void main(String[] args) {
        File file=new File("date\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file1 = new File(file, "a.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
