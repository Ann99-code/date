package com.itheima.outputstream;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author lina @date 2022/4/1816:45
 */
public class charstreamdemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "李娜姐姐";
   /*     byte[] bytes = s.getBytes();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));*/
        byte[] gbks = s.getBytes("GBK");
        System.out.println(gbks.length);
        System.out.println(Arrays.toString(gbks));

        byte []bytes={-64, -18, -60, -56, -67, -29, -67, -29};
        String s1 = new String(bytes,"GBK");
        System.out.println(s1);


    }
}
