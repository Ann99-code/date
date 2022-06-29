package com.itheima.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lina @date 2022/2/2815:57
 */
public class filedemo2 {
    public static void main(String[] args) throws IOException {
//        method1();

        File file1 = new File("F:\\txt\\aaa");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);

    }

    private static void method1() throws IOException {
        File file = new File("F:\\txt\\aaaa");
        boolean result = file.createNewFile();
        System.out.println(result);
    }
}
