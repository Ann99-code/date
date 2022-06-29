package com.itheima.thread;

/**
 * @author lina @date 2022/5/1716:18
 */
public class demo1 {
    public static void main(String[] args) {
        thread1_04 s = new thread1_04();
        thread1_04 s1 = new thread1_04();
        s.start();
        s1.start();
    }
}
