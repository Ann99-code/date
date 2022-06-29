package com.itheima.thread.ticket;

/**
 * @author lina @date 2022/5/2611:23
 */
public class demo7 {
    public static void main(String[] args) {
        ticket t = new ticket();
        Thread th = new Thread(t);
        Thread th1 = new Thread(t);
        Thread th2= new Thread(t);
        th.setName("第一个窗口");
        th1.setName("第二个窗口");
        th2.setName("第三个窗口");
        th.start();
        th1.start();
        th2.start();
    }

}
