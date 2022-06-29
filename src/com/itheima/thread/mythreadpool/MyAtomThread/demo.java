package com.itheima.thread.mythreadpool.MyAtomThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lina @date 2022/6/2711:10
 */
public class demo {
    public static void main(String[] args) {
        demo1();
      /*  System.out.println(ac);
        AtomicInteger ac1 = new AtomicInteger(10);
        System.out.println(ac1);
        System.out.println(ac1.get());
        int i = ac1.getAndDecrement();
        int o = ac1.getAndAdd(18);
        System.out.println(o);
        System.out.println(ac1.addAndGet(18));
        System.out.println(ac1.get());

        int q = ac1.getAndSet(10);
        System.out.println(q);
        System.out.println(ac1.get());*/


    }

    private static void demo1() {
        MyAtomThread atom = new MyAtomThread();
        for (int i = 0; i < 100; i++) {
            new Thread(atom).start();
        }
    }
}
