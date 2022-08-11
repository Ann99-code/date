package com.itheima.reflect.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lina @date 2022/8/415:59
 */
public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        1、获取class对象
        Class aClass = Class.forName("com.itheima.reflect.demo3.Student");
//        2、获取Method对象
        Method function4 = aClass.getDeclaredMethod("function4", String.class);
//        3、运行方法
//        invoke方法的第一个参数是方法的调用者，第二个参数是调用这个方法传递的实际参数
//        3.1   创建一个Student对象，当作方法的调用者
        Student student = (Student) aClass.newInstance();
//        3.2   运行方法
//        ？什么样的对象可以成为调用者？
        Object invoke = function4.invoke(student, "张三");
        System.out.println(invoke);
    }
}
