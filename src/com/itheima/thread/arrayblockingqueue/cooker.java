package com.itheima.thread.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lina @date 2022/5/3010:45
 */
//厨师线程
public class cooker extends Thread {
private ArrayBlockingQueue<String> ab;

    public cooker(ArrayBlockingQueue<String> ab) {
        this.ab= ab;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ab.put("汉堡包");
                System.out.println("厨师放了一块食物");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
