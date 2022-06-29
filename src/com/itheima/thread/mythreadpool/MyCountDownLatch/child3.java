package com.itheima.thread.mythreadpool.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author lina @date 2022/6/2816:03
 */
public class child3 extends Thread {
    private CountDownLatch ct;
    public child3(CountDownLatch ct) {
        this.ct = ct;
    }
    @Override
    public void run() {
//        1、吃饺子
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + "在吃第" + i + "个饺子");
        }
//        2、吃完说一声
        ct.countDown();
    }
}
