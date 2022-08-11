package com.itheima.Log4J.demo1;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lina @date 2022/8/1111:57
 */
public class Log4Jdemo01 {
//第三步
    //    获取日志对象的方式有两种
//    第一种：使用log4j自己的api来获取日志的对象
//    弊端：如果以后我们更换日志的实现类，那么下面的代码就要跟着改
//    private static final Logger LOGGER = Logger.getLogger(Log4Jdemo01.class);
    //    第二种：slf4j接口里面的api来获取日志里面的对象
//    好处：如果以后我们更换日志的实现类，下面的代码不用跟着修改
//    推荐使用
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log4Jdemo01.class);
    public static void main(String[] args) {
//        1、导入jar包
//        2、编写配置文件
//         3、在代码中获取日志的对象
//        4、按照日志级别设置日志信息
        LOGGER.debug("debug级别的日志");
        LOGGER.info("info级别的日志");
        LOGGER.warn("warn级别的日志");
        LOGGER.error("error级别的日志");

    }
}
