package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lina @date 2022/2/1111:24
 */
public class MyMap1 {

    public static void main(String[] args) {
        //多态
        Map<String, String> map = new HashMap<>();
        map.put("itheima001", "小智");
        map.put("itheima002", "小美");
        map.put("itheima003", "大胖");

        System.out.println(map);
    }
}
