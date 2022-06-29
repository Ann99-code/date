package com.itheima.thread;

/**
 * @author lina @date 2022/5/2016:03
 */
public class demo2 {
    public static void main(String[] args) {
        myrunnable r = new myrunnable();
        Thread t = new Thread(r);
        t.start();
        myrunnable r1 = new myrunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
