package org.example.service.impl;

import org.example.dao.TeacherDao;
import org.example.pojo.Student;
import org.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 20:42
 * @描述: TODO
 */

@Service(value = "teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    @Qualifier(value = "teacherDao")
    TeacherDao teacherDao;


    @Override
    public void printStudentsByName(String name) {
        Student[] students = teacherDao.findByName(name);
        System.out.println(Arrays.toString(students));
    }

    @Override
    public void printCourseNameByName(String name) {
        String course = teacherDao.findCourseByName(name);
        System.out.println(course);
    }
}
