package com.itheima.thread;

/**
 * @author lina @date 2022/5/1716:14
 */
public class thread1_04 extends Thread {
    @Override
    public void run() {
       //重写run方法后的代码就是线程在开启后要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了"+i);
        }
    }
}
