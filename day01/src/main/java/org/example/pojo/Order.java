package org.example.pojo;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/2 20:39
 * @描述: 测试spring使用有参构造器创建并实现依赖注入
 */
public class Order implements Serializable {
    private String name;
    private String good;
    private Integer index;

    public Order(String name, String good, Integer index) {
        this.name = name;
        this.good = good;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", good='" + good + '\'' +
                ", index=" + index +
                '}';
    }
}
