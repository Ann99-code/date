package com.itheima.thread.mythreadpool.Volatile;

/**
 * @author lina @date 2022/6/2215:21
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        while (money.i == 100000) {

        }
        System.out.println("结婚基金已经不是10万了");
    }
}
