package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lina @date 2022/2/2316:37
 */
public class streamdemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良", "谢广坤"));
//        遍历list，把所有以张开头的元素添加到list1中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }
            ArrayList<String> list2= new ArrayList<>();
            for (String s1 : list1) {
                if (s1.length()==3) {
                    list2.add(s1);
                }
            }
            for (String s1 : list2) {
                System.out.println(s1);
            }
        System.out.println("==========================");
//      stream流方式
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));
        }

    }

