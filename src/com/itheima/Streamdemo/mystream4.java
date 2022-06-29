package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author lina @date 2022/2/242:02
 */
public class mystream4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));
//        method1();
        long count = list1.stream().count();
        System.out.println(count);
    }

    private static void method1() {
    /* list1.stream().forEach(
             new Consumer<String>() {
                 @Override
                 public void accept(String s) {
                     System.out.println(s);
                 }
             }
     );*/
    /*    list1.stream().forEach((String s)->{
            System.out.println(s);
        });*/
//        list1.stream().forEach(s -> System.out.println(s));
    }
}
