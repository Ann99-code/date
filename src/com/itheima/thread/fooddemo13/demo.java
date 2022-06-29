package com.itheima.thread.fooddemo13;

/**
 * @author lina @date 2022/5/3012:39
 */
public class demo {
    public static void main(String[] args) {
        desk desk = new desk();
        foodie f = new foodie(desk);
        cooker c = new cooker(desk);
        f.start();
        c.start();
    }
}
