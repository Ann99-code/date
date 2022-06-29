package com.itheima.thread.ticket;

/**
 * @author lina @date 2022/5/2611:20
 */
public class ticket implements Runnable{
    private int tickets=100;
    private Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets <= 0) {
                    System.out.println("卖完了");
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + tickets + "张票");
                }
            }
        }

    }
}
