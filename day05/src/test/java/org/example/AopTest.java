package org.example;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/10 23:07
 * @描述: 测试
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int sum = userService.sum(2, 2);
        System.out.println("增强后的结果："+sum);
    }
}
