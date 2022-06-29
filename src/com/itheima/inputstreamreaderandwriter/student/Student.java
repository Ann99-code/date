package com.itheima.inputstreamreaderandwriter.student;

import java.io.Serializable;

/**
 * @author lina @date 2022/5/1710:25
 */
public class Student implements Serializable {
    private String name;
    private String age;

    private static final long serialVersionUID = 14L;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
