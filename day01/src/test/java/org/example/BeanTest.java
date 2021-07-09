package org.example;

import org.example.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/2 07:32
 * @描述: TODO
 */
public class BeanTest {
    public static void main(String[] args) {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 获取对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.print();
    }
}
