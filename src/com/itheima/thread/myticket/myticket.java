package com.itheima.thread.myticket;

/**
 * @author lina @date 2022/5/2616:44
 */
public class myticket extends Thread {
    private static int tickets=100;

    public myticket(String name) {
        super(name);
    }

    public myticket() {
        super();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets <= 0) {
                    System.out.println("卖完了");
                    break;
                } else {
                    try {
                        Thread.sleep(100);
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
