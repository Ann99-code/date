package com.itheima.thread.mythreadpool.demo1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lina @date 2022/6/716:18
 */
public class MyThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
         //创建一个默认的线程池对象，池子中默认是空的默认最多可以容纳int类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors建立线程池
        //ExecutorService-控制线程池
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        Thread.sleep(2000);
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        executorService.shutdown();
    }
}
