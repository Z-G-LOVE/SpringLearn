package org.example;

import org.example.pojo.Book;
import org.example.pojo.Order;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/2 20:48
 * @描述: TODO
 */
public class SpringDITest {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
        Book book = context.getBean("book", Book.class);
        Order order = context.getBean("order", Order.class);
        System.out.println(book);
        System.out.println(order);
    }
}
