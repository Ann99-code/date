package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lina @date 2022/2/2323:21
 */
public class mystream {
    public static void main(String[] args) {
//        单列集合
//        method1();
//        双列集合
//        method2();
//          数组
//        method3();
//        同数据类型的多个数据
//        method4();


    }

    private static void method4() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).forEach(s -> System.out.println(s));
    }

    private static void method3() {
        int [] s={1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(s).forEach(s1 -> System.out.println(s1));
    }

    private static void method2() {
        //          双列集合
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zhangsan", 23);
        hm.put("lisi", 24);
        hm.put("wangwu", 25);
        hm.put("zhaoliu", 26);
        hm.put("qianqi", 27);
//        keyset(键）->set->stream
        hm.keySet().stream().forEach(s -> System.out.println(s));
//        entryset（键值对）
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>(List.of("aaa", "bbb", "ccc"));
/*        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));*/
        list.stream().forEach(s -> System.out.println(s));

//        remove(list, stream);
    }

    private static void remove(ArrayList<String> list, Stream<String> stream) {
        list.remove("aaa");
        stream.forEach(s-> System.out.println(s));
    }
}
