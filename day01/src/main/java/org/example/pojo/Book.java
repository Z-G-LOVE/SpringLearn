package org.example.pojo;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/2 20:35
 * @描述: 测试使用set方法进行依赖注入
 */
public class Book implements Serializable {
    private String bookName;
    private String bookAuthor;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
