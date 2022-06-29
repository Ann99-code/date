package com.itheima.file;

import java.io.File;

/**
 * @author lina @date 2022/3/1011:03
 */
public class filedemo5 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        File[] files = file.listFiles();
        System.out.println(files);
        System.out.println(files.length);
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
