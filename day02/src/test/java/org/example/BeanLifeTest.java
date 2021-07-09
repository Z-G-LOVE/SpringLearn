package org.example;

import org.example.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/5 08:43
 * @描述: 测试bean生命周期的代码
 */
public class BeanLifeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLife.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        context.close();
    }
}
