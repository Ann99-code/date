package com.itheima.thread.mythreadpool.MyCountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author lina @date 2022/6/2816:00
 */
public class MyCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch ct = new CountDownLatch(3);
        mon mon = new mon(ct);
        mon.start();

        child1 child1 = new child1(ct);
        child1.setName("小明");

        child2 child2 = new child2(ct);
        child2.setName("小红");

        child3 child3 = new child3(ct);
        child3.setName("小刚");

        child1.start();
        child2.start();
        child3.start();



    }
}
