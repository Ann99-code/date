package com.itheima.inputstreamreaderandwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lina @date 2022/4/2714:32
 */
public class inputstreamreaderandwriter1 {
    public static void main(String[] args) throws IOException {
         //直接用filereader读取，可能会出现什么样的效果
        FileReader fileReader = new FileReader("F:\\date\\h.txt"  );
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.println((char) ch);
        }
        fileReader.close();
    }
}
