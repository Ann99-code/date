package com.itheima.thread;

/**
 * @author lina @date 2022/5/2516:52
 */
public class demo5 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);
    }
}
