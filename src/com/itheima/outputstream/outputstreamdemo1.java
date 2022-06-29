/*
package com.itheima.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class outputstreamdemo1 {
    public static void main(String[] args) {

        //创建
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\xztjh\\Desktop\\预算文本生成\\回复问题的答案\\问题整理.docx");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        //调用
        int b = 99;
        try {
            fos.write(b);
            //释放
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
*/
