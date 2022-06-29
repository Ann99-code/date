package com.itheima.InetAddress.inetsddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lina @date 2022/6/2915:16
 */

public class inetsddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress lina = InetAddress.getByName("DESKTOP-OL69UHD");
        String hostName = lina.getHostName();
        System.out.println("主机名为"+hostName);

        String hostAddress = lina.getHostAddress();
        System.out.println("主机ip为"+hostAddress);

    }
}
