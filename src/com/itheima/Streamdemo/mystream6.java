package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author lina @date 2022/2/2416:43
 */
public class mystream6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =1; i <=10; i++) {
            list.add(i);
        }
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
//        collect负责收集流里的数据，但不创建容器，也不负责把数据添加到容器中
//        Collectors.toList()会在底层创建一个List集合，并把所有的数据添加到List集合当中去
        List<Integer> list1 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        Set<Integer> set = list.stream().filter((s -> s % 2 == 0)).collect(Collectors.toSet());
        System.out.println(set);
    }
}
