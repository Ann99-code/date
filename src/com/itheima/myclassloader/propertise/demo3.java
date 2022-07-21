package com.itheima.myclassloader.propertise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lina @date 2022/7/2110:05
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        Properties propertise = new Properties();
        FileReader fileReader = new FileReader("F:\\date\\prop.properties");
        propertise.load(fileReader);
        System.out.println(propertise);
        fileReader.close();
        propertise.put("江苏", "南京");
        propertise.put("安徽", "南京");
        propertise.put("山东", "济南");
        FileWriter fileWriter = new FileWriter("F:\\date\\prop.properties");
        propertise.store(fileWriter, "注释");
        fileWriter.close();
    }
}
