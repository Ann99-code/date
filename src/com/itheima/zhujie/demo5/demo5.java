package com.itheima.zhujie.demo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lina @date 2022/8/1111:34
 */
public class demo5 {
    @Before
    public  void before(){
        System.out.println("before");
    }
    @Test
    public void test(){
        System.out.println("test");
    }
    @After
    public void after(){
        System.out.println("after");
    }
}
