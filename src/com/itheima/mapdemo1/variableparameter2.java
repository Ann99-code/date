package com.itheima.mapdemo1;

/**
 * @author lina @date 2022/2/1418:08
 */
public class variableparameter2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum1 = getsum(arr);
        System.out.println(sum1);

    }

    private static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


}
