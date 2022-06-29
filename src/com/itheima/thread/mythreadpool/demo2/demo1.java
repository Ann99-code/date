package com.itheima.thread.mythreadpool.demo2;

import java.util.concurrent.*;

/**
 * @author lina @date 2022/6/2210:40
 */
public class demo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
                for (int i=1;i<=16;i++) {
                    int y = i;
                    pool.submit(() -> System.out.println(Thread.currentThread().getName() + "------"+y+"启动了"));
                }
        pool.shutdown();
    }
}
