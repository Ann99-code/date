package com.itheima.InetAddress.TCPDemo.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author lina @date 2022/7/516:37
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3
                , 20,
                60, //临时线程空闲时间
                TimeUnit.SECONDS,//临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5),//阻塞队列，就是允许有多少个线程排队
                Executors.defaultThreadFactory(),//创建线程的方式，这里是默认的方式
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略，当有多个客户端连接的时候，超过线程池的数量，就拒绝连接，并抛出异常
        );

        while (true) {
            Socket accept = ss.accept();
            SocketThread socketThread = new SocketThread(accept);
//            Thread thread = new Thread(socketThread);
//            thread.start();
            pool.submit(socketThread);
        }
//        ss.close();
    }
}
