package com.enjoy.spring12.processor;

import com.enjoy.spring9.bean.Moon;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @auther xuxq
 * @date 2019/5/10 23:09
 */
@Component
public class BobBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("BobBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry(),bean的数量" + registry.getBeanDefinitionCount());
        AbstractBeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Moon.class).getBeanDefinition();
        registry.registerBeanDefinition("registry",definition);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BobBeanDefinitionRegistryPostProcessor.postProcessBeanFactory(),bean的数量" + beanFactory.getBeanDefinitionCount());
    }
}
