package com.itheima.thread.mythreadpool.MyAtomThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lina @date 2022/6/2711:06
 */
public class MyAtomThread implements Runnable {
    //    private int count = 0;//冰淇凌的数量为0
    AtomicInteger ac = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
/*            synchronized (this) {
                count++;
            }*/
            int s = ac.incrementAndGet();
            System.out.println("已经送了"+s+"个冰淇淋");
        }
    }
}
