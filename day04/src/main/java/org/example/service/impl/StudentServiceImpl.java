package org.example.service.impl;

import org.example.dao.StudentDao;
import org.example.pojo.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 20:38
 * @描述: TODO
 */
@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier(value = "studentDao")
    StudentDao studentDao ;


    @Override
    public void printStudent(String id) {
        Student student = studentDao.findById(id);
        System.out.println(student);
    }

    @Override
    public void printClassNumber(String number) {
        Student student = studentDao.findByClassNumber(number);
        System.out.println(student);
    }
}
