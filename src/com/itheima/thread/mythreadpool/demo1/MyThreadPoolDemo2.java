package com.itheima.thread.mythreadpool.demo1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author lina @date 2022/6/716:51
 */
public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
/*        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"执行了");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"执行了");
        });

        executorService.shutdown();*/

        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor) executorService;
        System.out.println(executorService1.getPoolSize());
    }
}
