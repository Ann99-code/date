package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lina @date 2022/2/1122:14
 */
public class MyMap3 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Map<String, String> map = new HashMap<>();
        map.put("1号丈夫","1号妻子");
        map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");
        map.put("5号丈夫","5号妻子");
        //获取所有的键
        Set<String> keys= map.keySet();
        //遍历set集合，得到每一个键
        for (String key : keys) {
            //通过每一个键key获取到对应的值
            String value = map.get(key);
            System.out.println(value);
        }



    }

}
