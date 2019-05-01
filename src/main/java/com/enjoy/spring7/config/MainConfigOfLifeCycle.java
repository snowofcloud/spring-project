package com.enjoy.spring7.config;

import com.enjoy.spring7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @auther xuxq
 * @date 2019/5/1 18:59
 */
@ComponentScan("com.enjoy.spring7.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Bean("dog7")
    public com.enjoy.spring.Dog dog() {
        System.out.println("给容器中注入dog6");
        return new com.enjoy.spring.Dog("黑色",12,"large");
    }

    @Scope("prototype")//多实例的应用
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }

}
