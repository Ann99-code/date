package com.itheima.reflect.demo1;

import java.lang.reflect.Constructor;

/**
 * @author lina @date 2022/7/2216:29
 */
public class demo2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Student> studentClass = Student.class;
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("---------------------------------");
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("-------------------------------------");
        Constructor<Student> constructor = studentClass.getConstructor();
        Constructor<Student> constructor1 = studentClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        System.out.println(constructor1);
        System.out.println("-----------------------------------");
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
    }
}
