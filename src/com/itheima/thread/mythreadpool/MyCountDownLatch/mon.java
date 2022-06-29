package com.itheima.thread.mythreadpool.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author lina @date 2022/6/2816:02
 */
public class mon extends Thread {
    private CountDownLatch ct;
    public mon(CountDownLatch ct) {
        this.ct = ct;
    }

    @Override
    public void run() {
//        1、等待
        try {
            ct.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        2、收拾碗筷
        System.out.println("妈妈准备收拾碗筷了");
    }
}
