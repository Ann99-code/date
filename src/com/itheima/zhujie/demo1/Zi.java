package com.itheima.zhujie.demo1;

/**
 * @author lina @date 2022/8/1014:32
 */
public class Zi extends Fu {
    @Override
    public void show() {
    }
@Deprecated
    public void method(){
        System.out.println("这是一个过时的方法");
    }

    @SuppressWarnings(value = "all")
//    表示压制本方法里的所有警告
    public void function() {
        int a = 10;
        int b = 20;
        System.out.println("压制警告");
    }
}
