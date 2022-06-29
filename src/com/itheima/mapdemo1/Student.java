package com.itheima.mapdemo1;

/**
 * @author lina @date 2022/2/1211:56
 */
public class Student{
//public class Student implements Comparable<Student>{

    private String name;
    private  int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

  /*  @Override
    public int compareTo(Student o) {
        //按照年龄进行排序，次要条件姓名
        int result=this.getAge() - o.getAge();
        result=result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }*/
}
