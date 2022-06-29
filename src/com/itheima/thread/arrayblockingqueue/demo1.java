package com.itheima.thread.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lina @date 2022/6/615:32
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> ab = new ArrayBlockingQueue<>(1);
        cooker c = new cooker(ab);
        foodie f = new foodie(ab);
        c.start();
        f.start();
    }
}
