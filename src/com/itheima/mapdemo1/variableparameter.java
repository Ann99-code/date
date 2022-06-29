package com.itheima.mapdemo1;

/**
 * @author lina @date 2022/2/1418:01
 */
public class variableparameter {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int sun = getSum(a, b);
        System.out.println(sun);
        int sun1 = getSum(a, b, c);
        System.out.println(sun1);

    }
    public static int getSum(int a,int b){
        return a+b;
    }

    public static int getSum(int a,int b,int c){
        return a+b+c;
    }
}
