package org.example;

import org.example.Dao.Impl.UserDaoImpl;
import org.example.Dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @作者: Administrator
 * @时间: 2021/7/10 15:53
 * @描述: 实现接口的动态代理(JDK动态代理)
 */
public class ProxyText {
    public static void main(String[] args) {
        UserDao userDao = (UserDao) Proxy.newProxyInstance(ProxyText.class.getClassLoader(), new Class[]{UserDao.class}, new UserDaoProxy(new UserDaoImpl()));
        Integer res = userDao.add(1, 3);
        System.out.println(res);
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(ProxyText.class.getClassLoader(), new Class[]{UserDao.class}, new InvocationHandler() {
            final Object obj = new UserDaoImpl();

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                if ("add".equals(method.getName())) {
                    args[0] = (Integer) args[0] * 2;
                    args[1] = (Integer) args[1] + 3;
                }
                invoke = method.invoke(obj, args);
                return invoke;
            }
        });
        Integer res1 = userDao1.add(1, 3);
        System.out.println(res1);
    }

    private static class UserDaoProxy implements InvocationHandler{
        Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object invoke = null;
            if ("add".equals(method.getName())) args[0] = (Integer) args[0] + 1;
            invoke = method.invoke(obj, args);
            return invoke;
        }
    }
}
