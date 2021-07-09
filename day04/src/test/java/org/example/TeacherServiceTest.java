package org.example;

import org.example.service.StudentService;
import org.example.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 20:46
 * @描述: TODO
 */
public class TeacherServiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.printCourseNameByName("张三");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.printStudent("3118005030");
        studentService.printStudent("3118005031");
    }
}
