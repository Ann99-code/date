package com.itheima.propertiesio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lina @date 2022/5/1712:14
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        //将本地文件中的键值对数据读取到集合中
        //将集合中的数据以键值对的形式保存到本地
        //读取
        Properties prop = new Properties();
        FileReader fileReader = new FileReader("F:\\date\\prop.properties");
//        prop.load(fileReader);
        prop.put("zhangsan", "123");
        prop.put("wangwu", "456");
        prop.put("lisi", "789");
        FileWriter fileWriter = new FileWriter("F:\\date\\prop.properties");
        prop.store(fileWriter,null);

        fileReader.close();
        System.out.println(prop);
    }
}
