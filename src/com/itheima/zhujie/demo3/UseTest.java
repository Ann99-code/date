package com.itheima.zhujie.demo3;

/**
 * @author lina @date 2022/8/1015:20
 */
public class UseTest {
//    没有使用Test注解
    public void show(){
        System.out.println( "useTest. . ..show. . .." );
    }
    //使用Test注解
     @Test
    public void method(){
        System.out.println( "useTest. . ..method. . .." );
    }
    //没有使用Test注解
     @Test
    public void function(){
        System.out.println( "useTest. . ..function. . ..");
}

}
