package com.enjoy.spring.config;

import com.enjoy.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.DoubleFunction;

/**
 * @auther xuxq
 * @date 2019/4/25 0:01
 */
@Configuration
public class DogConfig {
    //@Bean注解不指定时会以方法名作为id，指定时就以ddd为id,然后注入ioc容器里面
    @Bean("ddd")
    public Dog dog() {
        return new Dog("黑色",12,"large");
    }
}
