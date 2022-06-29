package com.itheima.thread.mythreadpool.Volatile2;

/**
 * @author lina @date 2022/6/2215:28
 */
public class demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("小璐同学");
        MyThread2 t2=new MyThread2();
        t2.setName("小夫同学");

        t1.start();
        t2.start();


    }
}
