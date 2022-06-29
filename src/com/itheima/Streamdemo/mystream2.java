package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author lina @date 2022/2/2323:49
 */
public class mystream2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良", "谢广坤"));
 /*       list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean result = s.startsWith("张");
                return result;
            }
        }).forEach(s->System.out.println(s));*/

/*
        list.stream().filter((String s) -> {
            boolean result = s.startsWith("张");
            return result;
        }).forEach(s -> System.out.println(s));
*/

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

    }
}

