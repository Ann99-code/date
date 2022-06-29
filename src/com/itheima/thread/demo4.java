package com.itheima.thread;

/**
 * @author lina @date 2022/5/2516:40
 */
public class demo4 {
    public static void main(String[] args) {
        MyThread th = new MyThread("lili");
        MyThread th1 = new MyThread("nanan");
     /*   th.setName("莉莉");
        th1.setName("拿拿");*/
        th.start();
        th1.start();
    }
}
