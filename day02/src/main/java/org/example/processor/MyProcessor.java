package org.example.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.io.Serializable;

/**
 * @作者: Administrator
 * @时间: 2021/7/5 08:39
 * @描述: 创建一个后置处理器，实现BeanPostProcessor接口
 */
public class MyProcessor implements BeanPostProcessor , Serializable {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean初始化前的后置处理");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean初始化后的后置处理");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
