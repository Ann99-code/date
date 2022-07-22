package com.itheima.reflect.demo1;

/**
 * @author lina @date 2022/7/2117:09
 */
public class demo {
    public static void main(String[] args) throws ClassNotFoundException {
//        class类中的静态方法forname("全类名")（包名加类名）
        Class<?> aClass = Class.forName("com.itheima.reflect.demo1.demo");
        System.out.println(aClass);
//        通过class属性来获取
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        Class<demo> demoClass = demo.class;
        System.out.println(demoClass);
//        利用对象的getClass方法来获取Class对象
//        getClass方法是定义在Object类中的
        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        System.out.println(aClass1);
    }
}
