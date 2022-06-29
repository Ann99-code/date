package com.itheima.mapdemo1;

/**
 * @author lina @date 2022/2/1511:01
 * 可变参数实现
 */
public class variableparameter3 {
    public static void main(String[] args) {
        int getsum = getsum(1,2,3,4,5,6,7,7,8,1,1,1,1,1,1,1,1);
        System.out.println(getsum);
    }

    public static int getsum(int number,int... arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
