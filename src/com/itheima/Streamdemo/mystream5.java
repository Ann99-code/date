package com.itheima.Streamdemo;

import java.util.ArrayList;

/**
 * @author lina @date 2022/2/2410:43
 */
public class mystream5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.stream().filter(s->s % 2 == 0).forEach(s -> System.out.println(s));
        System.out.println("=================");
        list.stream().forEach(s -> System.out.println(s));
    }
}
