package com.itheima.thread.demolamda;

/**
 * @author lina @date 2022/5/2716:44
 */
public class demo {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        new Thread(()->{
            while (true) {
                synchronized (a) {
                    synchronized (b) {
                        System.out.println("小康同学在走路");
                    }
                }
            }
        }).start();


        new Thread(()->{
            while (true) {
                synchronized (b) {
                    synchronized (a) {
                        System.out.println("小微同学在走路");
                    }
                }
            }
        }).start();
    }
}
