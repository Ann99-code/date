package com.itheima.myclassloader.propertise;

import java.util.Properties;
import java.util.Set;

/**
 * @author lina @date 2022/7/219:08
 */
public class demo2 {
    public static void main(String[] args) {
//        设置集合的键和值,都是String类型,底层调用HashTable方法,等同于put
        Properties prop = new Properties();
        prop.setProperty("江苏", "南京");
        prop.setProperty("安徽", "南京");
        prop.setProperty("山东", "济南");
        System.out.println(prop);
        prop.getProperty("江苏");
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(prop.getProperty(string));
        }

    }
}
