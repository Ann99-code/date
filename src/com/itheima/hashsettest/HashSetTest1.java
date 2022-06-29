package com.itheima.hashsettest;

import java.util.HashSet;

/**
 * @author lina @date 2022/2/910:17
 */
public class HashSetTest1 {

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("xiaohei", 23);
        Student s2 = new Student("xiaohei", 23);
        Student s3 = new Student("xiaomei", 22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student student : hs) {
            System.out.println(student);
        }
    }
}
