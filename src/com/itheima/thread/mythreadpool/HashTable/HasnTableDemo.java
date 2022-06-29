package com.itheima.thread.mythreadpool.HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lina @date 2022/6/2716:55
 */
public class HasnTableDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<>();
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
