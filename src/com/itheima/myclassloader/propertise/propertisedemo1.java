package com.itheima.myclassloader.propertise;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lina @date 2022/7/2015:58
 */
public class propertisedemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("小龙女", "尹志平");
        prop.put("郭襄", "杨过");
        prop.put("黄蓉", "欧阳克");
        System.out.println(prop);
        prop.remove("郭襄");
        System.out.println(prop);
        Object s = prop.get("黄蓉");
        System.out.println(s);
        System.out.println(prop);
//        遍历的两种方法:先得到所有的键,再得到值
        Set<Object> keySet = prop.keySet();
        for (Object o : keySet) {
            Object value = prop.get(o);
            System.out.println(o+"+"+value);
//            第二种方法:获得所有键值对对象,装的是键值对
            Set<Map.Entry<Object, Object>> entries = prop.entrySet();
            for (Map.Entry<Object, Object> entry : entries) {
                entry.getKey();
                entry.getValue();
            }

        }
    }
}
