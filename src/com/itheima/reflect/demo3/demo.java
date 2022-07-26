package com.itheima.reflect.demo3;

import java.lang.reflect.Method;

/**
 * @author lina @date 2022/7/2616:35
 */
public class demo {
    public static void main(String[] args) throws ClassNotFoundException {
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

//        不只public

    }
}
