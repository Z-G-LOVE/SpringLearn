package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 16:16
 * @描述: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String student_name;// 学生姓名
    private String stu_ID; // 学生ID
    private String class_number; // 学生班级
}
