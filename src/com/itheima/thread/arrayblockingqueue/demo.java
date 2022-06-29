package com.itheima.thread.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lina @date 2022/6/614:57
 */
public class demo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> ab = new ArrayBlockingQueue<>(1);
        ab.put("汉堡包");
        System.out.println(ab.take());
        System.out.println(ab.take());
        System.out.println("程序结束了");
    }
}
