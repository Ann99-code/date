package com.itheima.inputstreamreaderandwriter.covertedio;

import java.io.Serializable;

/**
 * @author lina @date 2022/5/1614:24
 */
public class user implements Serializable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public user() {
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
