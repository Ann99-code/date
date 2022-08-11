package com.itheima.emus.demo2;

/**
 * @author lina @date 2022/8/1011:05
 */
public class SeasonDemo2 {
    public static void main(String[] args) {
//        第一个方法
        String name = Season.SPRING.name();
        System.out.println(name);
        System.out.println("----------------------");
//        第二个方法
        int ordinal = Season.SUMMER.ordinal();
        System.out.println(ordinal);
        System.out.println("--------------------------");
//        第三个方法
        int i = Season.SUMMER.compareTo(Season.WINTER);
        System.out.println(i);
        System.out.println("---------------------");
//        第四个方法
        String s = Season.SUMMER.toString();
        System.out.println(s);
        System.out.println("--------------------------");
//        第五个方法
        Season spring = Enum.valueOf(Season.class, "SPRING");
        System.out.println(spring);
        System.out.println(spring==Season.SPRING);
        System.out.println("------------------------");
//        第六个方法
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

    }
}
