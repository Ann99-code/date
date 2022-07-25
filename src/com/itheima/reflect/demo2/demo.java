package com.itheima.reflect.demo2;

import java.lang.reflect.Field;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
//        1、获取class对象
        Class aClass = Class.forName("com.itheima.reflect.demo2.Student");
//        2、获取成员变量
//      全部公共的
        Field[] fields = aClass.getFields();
//        3、遍历
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----------------------------");
//        包含私有的额全部
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-----------------------------");
//        单个公共的
        Field field = aClass.getField("name");
//        4、赋值
//        4.1先创建一个Student对象
        Student student = (Student) aClass.newInstance();
//        4.2有了对象才可以给指定对象赋值
        field.set(student,"张三");
        System.out.println(student);
        System.out.println(field);
        System.out.println("-----------------------------");
//        单个私有的
        Field declaredField = aClass.getDeclaredField("money");
//        5、获取值
//        私有的变量，set和get方法，必须取消访问检查
        declaredField.setAccessible(true);
//        调用get方法获取值
        Student student1= (Student) aClass.newInstance();
        System.out.println(declaredField.get(student1));
        System.out.println(declaredField);
    }
}
