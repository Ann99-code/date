package com.itheima.mapdemo1;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author lina @date 2022/2/1416:13
 */
public class treemap1 {
    public static void main(String[] args) {
        //比较器排序，匿名内部类的方式
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Student s1 = new Student("xiaohei", 23);
        Student s2 = new Student("dapang", 22);
        Student s3 = new Student("xiaomei", 22);
        tm.put(s1, "江苏");
        tm.put(s2, "北京");
        tm.put(s3, "天津");
        tm.forEach(
                (Student key,String value)->{
                    System.out.println(key+value);
                }

        );
    }
}
