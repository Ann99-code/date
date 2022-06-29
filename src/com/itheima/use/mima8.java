package com.itheima.use;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lina @date 2022/4/2512:08
 */
public class mima8 {
    public static void main(String[] args) throws IOException {
         //实现键盘录入，把用户名和密码录入进来
        FileWriter fw = new FileWriter("C:\\Users\\xztjh\\Desktop\\mima\\mima.txt",true);
        Scanner sc = new Scanner(System.in);
        sc(fw, sc);
        System.out.println("是否还要继续输入密码？");
        String ys = sc.next();
        while(ys.equals("是")) {
            sc(fw, sc);
            System.out.println("是否还要继续输入密码？");
            String ys1 = sc.next();
            ys = ys1;
        }
        fw.close();
    }

    private static void sc(FileWriter fw, Scanner sc) throws IOException {
        System.out.println("请录入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        //分别把用户名和密码写到本地文件就可以了
        fw.write(username + "\t" + password + "\n");
        fw.flush();
    }
}
