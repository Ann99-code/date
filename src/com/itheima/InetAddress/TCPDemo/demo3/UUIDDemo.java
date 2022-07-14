package com.itheima.InetAddress.TCPDemo.demo3;

import java.util.UUID;

/**
 * @author lina @date 2022/7/1215:45
 */
public class UUIDDemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString().replace("-", "");
        System.out.println(s);

    }
}
