package com.itheima.reflect.demo3;

import java.lang.reflect.Method;

/**
 * @author lina @date 2022/7/2616:35
 */
public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        获取class对象
        Class aClass = Class.forName("com.itheima.reflect.demo3.Student");
//        含继承
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-----------------------------------------");
//        不含继承
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("-----------------------------------------");
//        只有public
//        无参
        Method function = aClass.getMethod("function");
        System.out.println(function);
        System.out.println("----------------------");
//        有参
        Method function4 = aClass.getMethod("function4", String.class);
        System.out.println(function4);
        System.out.println("---------------------------------");
//        不只public
        Method show = aClass.getDeclaredMethod("show");
        System.out.println(show);

    }
}
