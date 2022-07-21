package com.itheima.myclassloader.demo1;

/**
 * @author lina @date 2022/7/1916:42
 */
public class MyClassLeader {
    public static void main(String[] args) {
//        获得系统类加载器
        ClassLoader scl = ClassLoader.getSystemClassLoader();
//        获得父类加载器：平台加载器
        ClassLoader parent1 = scl.getParent();
//        获得启动类加载器
        ClassLoader parent2 = parent1.getParent();
        System.out.println("系统类加载器"+scl);
        System.out.println("平台类加载器"+parent1);
        System.out.println("启动类加载器" + parent2);
    }
}
