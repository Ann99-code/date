package com.itheima.outputstream;

import java.io.*;

/**
 * @author lina @date 2022/4/2615:31
 */
public class bufferedwriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\date\\h.txt",true));
        BufferedReader br = new BufferedReader(new FileReader("F:\\date\\h.txt"));
        String s = "你好，姐姐";
        bw.write(s+"\n");
        bw.newLine();
        bw.close();
        String line;
        int len;
        while ((line = br.readLine() )!= null) {
            System.out.println(line);
        }
        br.close( );
    }
}
