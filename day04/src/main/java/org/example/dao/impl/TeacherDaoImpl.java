package org.example.dao.impl;

import org.example.dao.TeacherDao;
import org.example.pojo.Student;
import org.example.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


/**
 * @作者: Administrator
 * @时间: 2021/7/9 16:46
 * @描述:
 */
@Repository(value = "teacherDao")
public class TeacherDaoImpl implements TeacherDao {
    @Autowired
    @Qualifier(value = "teacher1")
    Teacher teacher;
    @Override
    public Student[] findByName(String name) {
        if (name.equals(teacher.getName())) return teacher.getStudents();
        return null;
    }

    @Override
    public String findCourseByName(String name) {
        if (name.equals(teacher.getName())) return teacher.getCourse_name();
        return null;
    }
}
