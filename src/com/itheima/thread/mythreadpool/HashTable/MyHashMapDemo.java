package com.itheima.thread.mythreadpool.HashTable;

import java.util.HashMap;

/**
 * @author lina @date 2022/6/2716:38
 */
public class MyHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, String> hm = new HashMap<>();
        Thread t = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                hm.put(i + "", i + "");
            }
        });
        Thread t1 = new Thread(() -> {
            for (int i = 30; i < 50; i++) {
                hm.put(i + "", i + "");
            }
        });

        t.start();
        t1.start();
        System.out.println("-------------");
        Thread.sleep(1000);

        for (int i = 0; i < 50; i++) {
            System.out.println(hm.get(i+""));
        }

    }


}
