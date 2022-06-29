package com.itheima.inputstreamreaderandwriter.covertedio;

import com.itheima.mapdemo1.Student;

import java.io.*;

/**
 * @author lina @date 2022/5/1614:30
 */
public class coverteddemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        user user = new user("lisi", "qwer");
        //需求：把這個用戶信息保存到本地文件去
    /*    bufferedwriter(user);
        return;
*/
       /* objectoutputstream(user);
        return;*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\date\\i.txt"));
        Object obs = ois.readObject();
        user s = (user) obs;
        System.out.println(s);
        ois.close();
    }

    private static void objectoutputstream(user user) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\date\\i.txt"));
        oos.writeObject(user);
        oos.close();
    }

    private static void bufferedwriter(user user) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\date\\i.txt"));
        bw.write(user.getUsername());
        bw.newLine();
        bw.write(user.getPassword());
        bw.close();
    }
}
