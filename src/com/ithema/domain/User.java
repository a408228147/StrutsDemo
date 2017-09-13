package com.ithema.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/14.
 * 为什么要实现 Serializable
 * Serializable接口是启用其序列化功能的接口。实现java.io.Serializable 接口的类是可序列化的。没有实现此接口的类将不能使它们的任一状态被序列化或逆序列化。
 *   1、将对象的状态保存在存储媒体中以便可以在以后重新创建出完全相同的副本；
 　　2、按值将对象从一个应用程序域发送至另一个应用程序域。
 　　实现serializable接口的作用是就是可以把对象存到字节流，
     然后可以恢复。所以你想如果你的对象没实现序列化怎么才能进行网络传输呢，
   要网络传输就得转为字节流，所以在分布式应用中，你就得实现序列化，如果你不需要分布式应用，那就没那个必要实现序列化。
 */
public class User implements Serializable {
 private String username;
 private String password;
 private Date birthday;
 private String hobby;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean married;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
