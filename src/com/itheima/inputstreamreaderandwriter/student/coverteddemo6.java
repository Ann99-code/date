package com.itheima.inputstreamreaderandwriter.student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lina @date 2022/5/1710:52
 */
public class coverteddemo6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("肚子疼","18");
        Student s2 = new Student("张三", "20");
        Student s3 = new Student("李四","22");
        user s4 = new user("王五", "24");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\date\\j.txt"));
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        oos.writeObject(arr);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\date\\j.txt"));
        Object s = ois.readObject();
        ArrayList<Student> arr1 = (ArrayList<Student>)s;
        for (Student student : arr1) {
            System.out.println(student);
        }
        ois.close();

    }
}
