package com.itheima.thread.demo12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lina @date 2022/5/2715:39
 */
public class myrunnable implements Runnable {
    private static int ticket = 100;
    private static ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            if ("窗口1".equals(Thread.currentThread().getName())) {
                //同步方法
                lock.lock();
                boolean synmethod = synmethod();
                if (synmethod) {
                    break;
                }
                lock.unlock();
            }
            if ("窗口2".equals(Thread.currentThread().getName())) {
                //同步代码块
//                synchronized (myrunnable.class) {
                try {
                    lock.lock();
                    if (ticket == 0) {
                        break;
                    } else {
                        Thread.sleep(10);
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + ticket + "张票");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
//                }
            }
        }
    }


    private static boolean synmethod() {
        if (ticket == 0) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + ticket + "张票");
            return false;
        }

    }
}
