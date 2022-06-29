package com.itheima.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lina @date 2022/5/2416:02
 */
public class demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        mycallable t1 = new mycallable();
        FutureTask<String> f = new FutureTask<>(t1);
        Thread t = new Thread(f);
        t.start();
        String s = f.get();
        System.out.println(s);
    }

}
