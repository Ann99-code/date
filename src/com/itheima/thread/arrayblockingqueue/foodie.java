package com.itheima.thread.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lina @date 2022/5/3010:44
 */
//吃货线程


public class foodie extends Thread {
    private ArrayBlockingQueue<String> ab;
    public foodie(ArrayBlockingQueue<String> ab) {
        this.ab = ab;
    }

    @Override
    public void run() {
        while (true) {
            try {

                String take = ab.take();
                System.out.println( "------------"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
