package org.example.dao.impl;

import org.example.dao.StudentDao;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 16:45
 * @描述: TODO
 */
@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    @Qualifier(value = "stu1")
    Student student1 ;

    @Autowired
    @Qualifier(value = "stu2")
    Student student2 ;

    @Override
    public Student findById(String id) {
        if (id.equals(student1.getStu_ID())) return student1;
        else if (id.equals(student2.getStu_ID())) return student2;
        return null;
    }

    @Override
    public Student findByClassNumber(String number) {
        if (number.equals(student1.getClass_number())) return student1;
        else if (number.equals(student2.getClass_number())) return student2;
        return null;
    }
}
