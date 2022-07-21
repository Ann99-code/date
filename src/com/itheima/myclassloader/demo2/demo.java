package com.itheima.myclassloader.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author lina @date 2022/7/2011:54
 */
public class demo {
    public static void main(String[] args) throws IOException {
//        获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        通过系统类加载器加载资源文件
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(resourceAsStream);
        System.out.println(prop);
    }
}
