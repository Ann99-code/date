package com.itheima.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lina @date 2022/4/923:33
 */
public class outputdemo3 {
    public static void main(String[] args)  {
        FileOutputStream fos = null;
        try {
            System.out.println(2/0);
            fos = new FileOutputStream("F:\\date\\a.txt",true);
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* byte[] bys = {97, 98, 99};
        fos.write(bys);*/
      /*  byte[] bys = {97, 98, 99,100,101,102,103,104,105};
        fos.write(bys,3,5);*/
        byte[] bytes = "nishuoniaibuaiwo".getBytes();
        try {
            fos.write(bytes,2,3);
            byte[] bytes1 = "hellonihaoa".getBytes();
            for (int i = 0; i < 10; i++) {
                fos.write(bytes1[i]);
                fos.write("\r\n".getBytes());        }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
