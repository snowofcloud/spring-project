package com.enjoy.spring4.config;

import com.enjoy.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @auther xuxq
 * @date 2019/4/27 18:09
 */
@Configuration
public class DogConfig4 {
    //给容器中注册一个bean, 类型为返回值的类型, 默认是单实例
    /*
     * 懒加载: 主要针对单实例bean:默认在容器启动的时候创建对象
     * 懒加载:容器启动时候不创建对象, 仅当第一次使用(获取)bean的时候才创建被初始化
     */
    @Lazy
    @Bean
    public Dog dog() {
        System.out.println("给容器中添加了dog");
        return new Dog("黑色",12,"large");
    }
}
