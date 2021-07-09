package org.example;

import org.example.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;

/**
 * @作者: Administrator
 * @时间: 2021/7/5 11:16
 * @描述: 测试spring引入properties文件进行动态注入bean属性
 */
public class PropertiesTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        try {
            user.setUser_name(new String(user.getUser_name().getBytes("iso-8859-1"),"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
