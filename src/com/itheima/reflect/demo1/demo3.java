package com.itheima.reflect.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lina @date 2022/7/2516:39
 */
public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        1、获取class对象
        Class<?> aClass = Class.forName("com.itheima.reflect.demo1.Student");
//        2、获取构造
        Constructor constructor = aClass.getConstructor(String.class, int.class);
//        3、利用newInstance创建Student的对象
        Student student = (Student)constructor.newInstance("张三", 23);
        System.out.println(student);

    }
}
