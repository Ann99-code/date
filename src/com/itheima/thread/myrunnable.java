package com.itheima.thread;

/**
 * @author lina @date 2022/5/2016:00
 */
public class myrunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方式实现多线程"+i);
        }
    }
}
