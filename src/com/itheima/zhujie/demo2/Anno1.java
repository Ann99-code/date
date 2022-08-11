package com.itheima.zhujie.demo2;

/**
 * @author lina @date 2022/8/1014:48
 */
public @interface Anno1 {
//    定义一个基本数据类型的属性
    int a () default 23;

    //    定义一个string类型的属性
    String s() default "nello,world";
    String name()default "lina";

//      定义一个class类型的属性
    public Class clazz() default Anno2.class;

//    定义一个注解类型的属性
    public Anno2 anno() default @Anno2;

//    定义一个枚举类型的属性
    public Season season()default Season.SUMMER;

    //    以上类型的一维数组
//    int
    int[] att() default {1, 2, 3, 4, 5};

    //    枚举
    Season[] seasons() default {Season.SUMMER, Season.SPRING};

//    value
    public String value();

}
