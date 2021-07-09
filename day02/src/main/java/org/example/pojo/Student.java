package org.example.pojo;


/**
 * @作者: Administrator
 * @时间: 2021/7/5 08:33
 * @描述: 创建student实体类
 */
public class Student {
    private String name;

    public Student() {
        System.out.println("bean的创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("bean的属性赋值");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("bean的初始化");
    }
    public void destroy(){
        System.out.println("bean的销毁");
    }
}
