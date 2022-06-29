package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lina @date 2022/2/2516:13
 */
public class mystream8 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>(List.of("张国立","张晋","刘烨","郑伊建","徐峥","王宝强"));
        ArrayList<String> womanList = new ArrayList<>(List.of("郑爽","杨紫","关晓彤","张天爱","杨幂","赵丽颖"));
        manList.stream().filter(s -> s.length() == 3).limit(2);

    }
}
