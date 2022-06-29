package com.itheima.mapdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lina @date 2022/2/2116:39
 */
public class variableparameter4 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        很明显方法三和方法四是同样的功能，但方法三比方法四更高效
    }

    private static void method4() {
        Map<String, String> map = Map.ofEntries(Map.entry("zhangsan", "江苏"), Map.entry("lisi", "北京"));
        System.out.println(map);
    }

    private static void method3() {
        Map<String, String> map = Map.of("zhangsan", "江苏", "lisi", "北京", "wangwu", "天津");
        System.out.println(map);
    }

    private static void method2() {
        //        传递的参数当中不能存在相同的元素
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
    }

    private static void method1() {
        List<String> list = List.of("a", "b", "c", "d");
        System.out.println(list);
//        list.add("Q");
//        list.remove("a");
//        list.set(0, "A");
        System.out.println(list);
//        ArrayList<Object> list1 = new ArrayList<>();
//        集合的批量添加
//
        ArrayList<String> arrayList = new ArrayList<>(List.of("a", "b", "c", "c"));
        System.out.println(arrayList);
    }
}
