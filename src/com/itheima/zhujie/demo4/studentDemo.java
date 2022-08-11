package com.itheima.zhujie.demo4;

/**
 * @author lina @date 2022/8/1016:11
 */
public class studentDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        获取到Student类的字节码文件对象
//        获取注解
        Class<?> aClass = Class.forName("com.itheima.zhujie.demo4.student");
//        当前这个类上面是否有这个注解
        boolean result = aClass.isAnnotationPresent(Anna.class);
        System.out.println(result);

    }
}
