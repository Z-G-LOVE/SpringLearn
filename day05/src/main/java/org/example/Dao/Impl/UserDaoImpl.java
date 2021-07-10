package org.example.Dao.Impl;

import org.example.Dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @作者: Administrator
 * @时间: 2021/7/10 15:52
 * @描述: 具体实现类
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
