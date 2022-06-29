package com.itheima.thread.mythreadpool.Volatile2;

/**
 * @author lina @date 2022/6/2215:21
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {

        while (true) {
            synchronized (money.lock) {

                if (money.i!=100000) {
                    System.out.println("结不了婚了");
                    break;
                }
            }
        }
    }
}
