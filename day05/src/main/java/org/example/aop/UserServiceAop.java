package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @作者: Administrator
 * @时间: 2021/7/10 22:45
 * @描述: TODO
 */
@Aspect
@Component
public class UserServiceAop {

    @Pointcut(value = "execution(* org.example.service.impl.UserServiceImpl.sum(..))")
    public void exe(){}


    @Around(value = "exe()")
    public Object before(ProceedingJoinPoint pjp) throws Throwable {
        // 获取增强方法的参数
        Object[] args = pjp.getArgs();
        System.out.println("原来的参数："+Arrays.toString(args));
        // 参数的修改
        args[0] = (int)args[0] + 1;
        args[1] = (int)args[1] * 12;
        Object proceed;
        // 将修改的参数传入增强的方法
        proceed = pjp.proceed(args);
        System.out.println("修改后的参数：" + Arrays.toString(args));
        return proceed;
    }

/*    @Before(value = "exe()")
    public void before(){
        System.out.println("--------");
    }*/
}
