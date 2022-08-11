package com.itheima.zhujie.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lina @date 2022/8/1015:23
 */
public class AnnoDemo {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
//        通过反射获得UseTest类的字节码文件
        Class<?> aClass = Class.forName("com.itheima.zhujie.demo3.UseTest");
        UseTest  useTest = (UseTest) aClass.newInstance();
//        通过反射获取这个类里的所有方法对象
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
//            如果当前这个方法上有test注解就运行他，否则不运行
//            declaredMethod依次表示每一个方法对象
//            isAnnotationPresent()判断当前方法上是否有指定的注解
//            参数：注解的字节码文件对象
//            返回值：布尔结果，true  存在，false  不存在
            if (declaredMethod.isAnnotationPresent(Test.class)) {
                declaredMethod.invoke(useTest);
            }
        }

    }
}
