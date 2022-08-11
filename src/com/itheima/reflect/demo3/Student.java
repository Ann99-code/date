package com.itheima.reflect.demo3;

/**
 * @author lina @date 2022/7/2616:35
 */
public class Student {
//    私有的,无参无返回值
    private void show(){
        System.out.println("show私有的,无参无返回值");
    }
//    公共的,无参无返回值
    public void function(){
        System.out.println("function1公共的,无参无返回值");
    }
//    公共的,有参无返回值
    public void function2(String name){
        System.out.println("function2公共的,有参无返回值"+name);
    }
//    公共的,无参有返回值
    public String function3(){
        System.out.println("function3公共的,无参有返回值");
        return "aaa";
    }
//    公共的,有参有返回值
    public String function4(String name){
        System.out.println("function4公共的,有参有返回值"+name);
        return "bbb";
    }

}
