package com.itheima.zhujie.demo4;

import java.lang.annotation.*;

/**
 * @author lina @date 2022/8/1016:02
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.METHOD})//指定注解使用的位置（成员变量，类，方法）
@Retention(value=RetentionPolicy.RUNTIME)//指定该注解的存活时间
@Inherited//指定该注解可以被继承
public @interface Anna {
}
