package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lina @date 2022/2/1211:56
 */
public class MyMap5 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("xiaohei", 23);
        Student s2 = new Student("dapang", 22);
        Student s3 = new Student("xiaomei", 22);
        hm.put(s1, "江苏");
        hm.put(s2, "北京");
        hm.put(s3, "天津");
        //先获取所有的键，再通过键来找对应的值
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String s = hm.get(key);
            System.out.println(key + "+" + s);
        }
        System.out.println("========================");
        //先获取到entry对象，再获取到每一个键和值
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }
        System.out.println("========================");

    //第三种，Map中的foreach方法+lamada表达式
        hm.forEach(
                (Student key,String value)->{
                    System.out.println(key + value);
                }
        );


    }
    }

