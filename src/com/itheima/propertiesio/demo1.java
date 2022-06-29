package com.itheima.propertiesio;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lina @date 2022/5/1711:28
 */
public class demo1 {
    public static void main(String[] args) {
        Properties prop =new Properties();
        //增
        prop.put("小龙女", "刘亦菲");
        prop.put("郭襄", "杨幂");
        prop.put("杨过", "黄晓明");
        System.out.println(prop);
        //删
        prop.remove("杨过");
        System.out.println(prop);
        //改
        prop.put("杨过", "明明");
        System.out.println(prop);

        //查
        Object o = prop.get("小龙女");
        System.out.println(o);

        //遍历
        Set<Object> keySet = prop.keySet();
        for (Object o1 : keySet) {
            System.out.println(o1);
        }

        System.out.println("==================================");
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }

}
