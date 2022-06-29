package com.itheima.thread;

import java.util.concurrent.Callable;

/**
 * @author lina @date 2022/5/2415:37
 */
public class mycallable implements Callable<String> {


    @Override
    public String  call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟男孩表白"+i);
        }
        return "答应";
    }
}
