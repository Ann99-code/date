package com.itheima.outputstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author lina @date 2022/4/269:40
 */
public class charstreamdemo9 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("F:\\date\\e.txt"));
        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        br.close();

    }
}

