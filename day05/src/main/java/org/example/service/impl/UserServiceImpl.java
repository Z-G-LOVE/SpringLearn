package org.example.service.impl;

import org.example.Dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @作者: Administrator
 * @时间: 2021/7/10 22:40
 * @描述: userDao 的 Service层接口实现，AOP增强类
 */
@Service (value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier(value = "userDao")
    UserDao userDao;

    @Override
    public int sum(int a, int b) {
        return userDao.add(a,b);
    }
}
