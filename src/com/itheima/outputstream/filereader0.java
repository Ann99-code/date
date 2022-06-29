package com.itheima.outputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lina @date 2022/4/2511:05
 */
public class filereader0 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("F:\\date\\e.txt");
        //读取数据
        //一次读取一个字符
//        char [] chars=new char[1028];
        int s;
        while ((s = fr.read() )!= -1) {
            System.out.print((char)s);
        }

        //一次读取多个字符
        //创建数组
        char [] chars=new char[1024];
        int len;
        while ((len = fr.read(chars) )!= -1) {
            System.out.print(new String(chars,0,len));
        }
        //释放资源
        fr.close();

    }
}
