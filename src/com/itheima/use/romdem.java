package com.itheima.use;

import java.util.Random;

/**
 * @author lina @date 2022/3/1815:51
 */
public class romdem {
    public static void main(String[] args) {
        Random s = new Random();
        int ran1 = getRan1(s);
        if (ran1>5) {
            System.out.println(ran1);
        }else{
            System.out.println("小于五");
            getRan1(s);
        }

    }

    private static int getRan1(Random s) {
        return s.nextInt(30);
    }
}
