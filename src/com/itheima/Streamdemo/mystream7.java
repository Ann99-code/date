package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lina @date 2022/2/2512:07
 */
public class mystream7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");
        Map<String, Integer> map = list.stream().filter(
                s -> {
                    String[] split = s.split(",");
                    int age = Integer.parseInt(split[1]);
                    return age >= 24;
                }
        ).collect(Collectors.toMap(
                s ->s.split(",")[0],
                s-> Integer.parseInt(s.split(",")[1])));
        System.out.println("map=="+map);
    }
}
