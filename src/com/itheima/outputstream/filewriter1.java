package com.itheima.outputstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lina @date 2022/4/2216:47
 */
public class filewriter1 {
    public static void main(String[] args) throws IOException {
        //首先创建对象
//        FileWriter fw = new FileWriter(new File("F:\\date\\b.txt"));
        FileWriter fw = new FileWriter("F:\\date\\e.txt");
        //写入数据,一次写一个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);
        fw.write(100);
        //一次写一个字符组
        char[] chars = {97, 98, 99, 100, 101, 102, 103, 104};
        fw.write(chars);
        //写入字符数组的一部分
        fw.write(chars,2,4);
        //写一个字符串
        String s = "李娜姐姐";
        fw.write(s);
        //写入字符串的一部分
        fw.write(s,1,2);
        //关闭流
//        fw.close();
        fw.flush();

    }
}
