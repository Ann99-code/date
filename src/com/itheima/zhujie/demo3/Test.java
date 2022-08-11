package com.itheima.zhujie.demo3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lina @date 2022/8/1015:22
 */
//表示Test这个注解的存活时间
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {

}
