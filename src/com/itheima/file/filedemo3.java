package com.itheima.file;

import java.io.File;

/**
 * @author lina @date 2022/3/29:49
 */
public class filedemo3 {
    public static void main(String[] args) {
        File file = new File("F:\\txt\\aaa");
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
