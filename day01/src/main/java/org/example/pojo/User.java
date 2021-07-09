package org.example.pojo;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/2 07:27
 * @描述: TODO
 */
public class User implements Serializable {
    // 私有化构造器
    private User(){
        System.out.println("该方法被访问了。。。");
    }
    // 创建单例
    static  User user;
    // DCL单例
    public static User getInstance(){
        if (user == null){
            synchronized (User.class){
                if (user == null) user = new User();
            }
        }
        return user;
    }
    public void print(){
        if (user == null) System.out.println("user未经过getInstance()创建" + user);
        else System.out.println("user经过了getInstance()创建" + user);
    }
}
