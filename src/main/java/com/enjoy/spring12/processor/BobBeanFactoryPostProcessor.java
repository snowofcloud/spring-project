package com.enjoy.spring12.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @auther xuxq
 * @date 2019/5/10 23:00
 */
@Component
public class BobBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BobBeanFactoryPostProcessor......BeanFactoryPostProcessor.postProcessBeanFactory()");
        int count = beanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("beanFactory中有" + count + "个bean");
        System.out.println(Arrays.asList(beanDefinitionNames));
    }

}
