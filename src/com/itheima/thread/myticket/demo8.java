package com.itheima.thread.myticket;

/**
 * @author lina @date 2022/5/2616:49
 */
public class demo8 {
    public static void main(String[] args) {
//        fs1();
        myticket s1 = new myticket("窗口1");
        myticket s2 = new myticket("窗口2");
        myticket s3 = new myticket("窗口3");
        s1.start();
        s2.start();
        s3.start();

    }

    private static void fs1() {
        myticket m = new myticket();
        Thread s1 = new Thread(m,"窗口1");
        Thread s2 = new Thread(m,"窗口2");
        Thread s3 = new Thread(m,"窗口3");
        s1.start();
        s2.start();
        s3.start();
    }
}
