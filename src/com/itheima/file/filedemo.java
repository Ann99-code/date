package com.itheima.file;

import java.io.File;

/**
 * @author lina @date 2022/2/2815:07
 */
public class filedemo {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
    }

    private static void method3() {
        String path2 = "a.txt";
        File file1 = new File("F:\\txt");
        File file = new File(file1, path2);
        System.out.println(file);
    }

    private static void method2() {
        String path1 = "F:\\txt";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        System.out.println(file);
    }

    private static void method1() {
        String path = "F:\\txt\\a.txt";
        File file = new File(path);
        System.out.println(file);
    }
}
