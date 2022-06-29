package com.itheima.thread;

/**
 * @author lina @date 2022/5/2516:57
 */
public class demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread s = new Thread();
        s.start();
        System.out.println("睡觉前");
        Thread.sleep(10000);
        System.out.println("睡觉后");


    }
}
