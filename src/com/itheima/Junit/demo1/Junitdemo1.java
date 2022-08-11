package com.itheima.Junit.demo1;

import org.junit.Test;

/**
 * @author lina @date 2022/8/1016:55
 */
public class Junitdemo1 {
    public static void main(String[] args) {

    }
    @Test
    public void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
    }
}
