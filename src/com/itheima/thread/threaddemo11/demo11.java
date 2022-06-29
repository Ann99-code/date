package com.itheima.thread.threaddemo11;

/**
 * @author lina @date 2022/5/2715:51
 */
public class demo11 {
    public static void main(String[] args) {
        myrunnable m1 = new myrunnable();
        Thread s1 = new Thread(m1,"窗口1");
        Thread s2 = new Thread(m1,"窗口2");
        s1.start();
        s2.start();

    }
}
