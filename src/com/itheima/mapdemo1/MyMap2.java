package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lina @date 2022/2/1114:27
 */
public class MyMap2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("itheima001", "小智");
        map.put("itheima002", "小美");
        map.put("itheima003", "大胖");
        map.put("itheima004", "小黑");
        map.put("itheima005", "大师");
        //System.out.println(map);

        //method1(map);

        //method2(map);
//        method3(map);
//        method4(map);

        //method5(map);
//        method6(map);
//        method7(map);


    }

    private static void method7(Map<String, String> map) {
        int size = map.size();
        System.out.println(size);
    }

    private static void method6(Map<String, String> map) {
        boolean empty = map.isEmpty();
        System.out.println(empty);
        map.clear();
        boolean empty1 = map.isEmpty();
        System.out.println(empty1);
    }

    private static void method5(Map<String, String> map) {
        boolean s1 = map.containsValue("aaa");
        boolean s2 = map.containsValue("小智");
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void method4(Map<String, String> map) {
        boolean s= map.containsKey("itheima001");
        System.out.println(s);
        boolean s2 = map.containsKey("itheima006");
        System.out.println(s2);
    }

    private static void method3(Map<String, String> map) {
        map.clear();
        System.out.println(map);
    }

    private static void method2(Map<String, String> map) {
        String s = map.remove("itheima001");
        System.out.println(s);
        System.out.println(map);
    }

    /*
        * put方法：
        1. 键不存在→添加键值对
        2. 键存在→覆盖原键值对，原键值对作为返回值进行返回
    */
    private static void method1(Map<String, String> map) {
        String s= map.put("itheima001", "aaa");
        System.out.println(s);
        System.out.println(map);
    }
}
