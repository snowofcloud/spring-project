package com.enjoy.spring.config;

import com.enjoy.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther xuxq
 * @date 2019/4/25 0:01
 */
@Configuration
public class DogConfig {
    //@Bean注解的id不指定时会以方法名作为id，指定时就以ddd为id,然后注入ioc容器里面
    //@Bean
    @Bean("dd23d")
    public Dog dogg() {
        return new Dog("黑色",12,"large");
    }
}
