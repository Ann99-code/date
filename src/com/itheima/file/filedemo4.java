package com.itheima.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lina @date 2022/3/211:49
 */
public class filedemo4 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method5();
        File file = new File("D:\\");
        File[] files = file.listFiles();
        System.out.println(files.length);
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    private static void method5() {
        File file = new File("a.txt");
        String fileName = file.getName();
        System.out.println(fileName);
        File file1= new File("F:\\txt");
        String file1Name = file1.getName();
        System.out.println(file1Name);
    }

    private static void method3() {
        File file = new File("a.txt");
        boolean exists = file.exists();
        System.out.println(exists);
    }


    private static void method2() {
        File file = new File("F:\\txt");
        boolean file2 = file.isFile();
        boolean directory = file.isDirectory();
        System.out.println(file2);
        System.out.println(directory);
    }

    private static void method1() {
        File file = new File("F:\\txt\\a.txt");
        boolean file1 = false;
        try {
            file1 = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1);
        boolean file2 = file.isFile();
        boolean directory = file.isDirectory();
        System.out.println(file2);
        System.out.println(directory);
    }
}
