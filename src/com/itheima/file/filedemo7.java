package com.itheima.file;

import java.io.File;
import java.util.HashMap;

/**
 * @author lina @date 2022/3/1116:31
 */
public class filedemo7 {
    public static void main(String[] args) {
        File date = new File("F:\\date");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm,date);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String,Integer> hm,File date) {
        File[] files = date.listFiles();

        for (File file : files) {
            System.out.println(file);
            if (file.isFile()) {
                //如果你是一个文件，就统计文件的后缀名
                String[] filenamearr = file.getName().split("\\.");
                System.out.println(filenamearr);
                //aaa a.a.a.a.txt此类的特殊情况此次先不做考虑，只统计长度为二的情况
                if (filenamearr.length == 2) {
                    String filendname = filenamearr[1];
                    if (hm.containsKey(filendname)) {
                        Integer count = hm.get(filendname);
                        count++;
                        hm.put(filendname, count);
                    }else {
                        hm.put(filendname, 1);
                    }

                }

            }else{
                getCount(hm, file);
            }
        }
    }
}
