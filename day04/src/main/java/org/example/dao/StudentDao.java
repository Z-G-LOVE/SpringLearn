package org.example.dao;

import org.example.pojo.Student;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 16:34
 * @描述: TODO
 */
public interface StudentDao {
    Student findById(String id);
    Student findByClassNumber(String number);
}
