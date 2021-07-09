package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/9 16:14
 * @描述: TODO
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher implements Serializable {
    private String name;// 教师姓名
    private String course_name;  //教学课程
    private Student[] students; // 学生
    private boolean master;// 是否为班主任
}
