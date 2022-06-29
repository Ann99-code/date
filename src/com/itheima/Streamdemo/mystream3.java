package com.itheima.Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lina @date 2022/2/241:19
 */
public class mystream3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤",
                "谢广坤","谢广坤","谢广坤","谢广坤","谢广坤"));
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));
//        limat要前面的，skip要后面的
//        limit(保留前两位)
//        list.stream().limit(2).forEach(s-> System.out.println(s));
//      skip(跳过前两位)
//        list.stream().skip(2).forEach(s -> System.out.println(s));
//        concat
/*        Stream<String> stream = list.stream();
        Stream<String> stream1 = list1.stream();
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.println(s));*/
//        Stream.concat(list.stream(), list1.stream()).forEach(s -> System.out.println(s));
//      distinct去重
//        list.stream().distinct().forEach(s -> System.out.println(s));
    }
}
