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
//        私有的构造方法
        Constructor<?> constructor1 = aClass.getDeclaredConstructor(String.class);
//        3、利用newInstance创建Student的对象
        Student student = (Student)constructor.newInstance("张三", 23);
        System.out.println(student);
//        被private修饰的成员不能直接用newInstance
//        如果用反射强行获取并使用，需要临时取消访问检查
        constructor1.setAccessible(true);
        Student student1 = (Student) constructor1.newInstance("李四");
        System.out.println(student1);
    }
}
