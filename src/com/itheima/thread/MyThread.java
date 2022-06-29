package com.itheima.thread;

/**
 * @author lina @date 2022/5/2516:39
 */
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@@@"+i);

        }
    }
}
