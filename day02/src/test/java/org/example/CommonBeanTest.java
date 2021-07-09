package org.example;

import org.example.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/5 06:29
 * @描述: TODO
 */
public class CommonBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("commonBean.xml");
        User u1 = context.getBean("user", User.class);
        User u2 = context.getBean("user2", User.class);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1 == u2);
    }
}
