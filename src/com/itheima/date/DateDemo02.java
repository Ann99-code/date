package com.itheima.date;

import java.util.Date;

/**
 * @author lina @date 2021/12/2416:36
 */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象 Date d = new Date();
        Date d = new Date();
        System.out.println(d.getTime()/1000/60/60/24/12/30+"年");
        long time = System.currentTimeMillis();//获得系统的时间，单位为毫秒
        d.setTime(time);
        System.out.println(d);
        String a = "abc";
        StringBuilder s = new StringBuilder("ABC");
        StringBuilder append = s.append("2.03");
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
    }
}
