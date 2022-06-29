package com.itheima.thread.mythreadpool.Volatile;

/**
 * @author lina @date 2022/6/2215:27
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money.i = 90000;

    }
}
