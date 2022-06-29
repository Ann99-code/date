package com.itheima.thread.threaddemo11;

/**
 * @author lina @date 2022/5/2715:39
 */
public class myrunnable implements Runnable {
    private static int ticket = 100;



    @Override
    public void run() {
        while (true) {
            if ("窗口1".equals(Thread.currentThread().getName())) {
                //同步方法
                boolean synmethod = synmethod();
                if (synmethod) {
                    break;
                }
            }
            if ("窗口2".equals(Thread.currentThread().getName())) {
                //同步代码块
                synchronized (myrunnable.class) {
                    if (ticket == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + ticket  + "张票");
                    }
                }
                }
            }
        }


    private static synchronized boolean synmethod() {
        if (ticket == 0) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + ticket  + "张票");
            return false;
        }
    }
}
