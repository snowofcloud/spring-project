package com.enjoy.spring5.config;

import com.enjoy.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @auther xuxq
 * @date 2019/4/27 22:07
 */
public class DogConfig5 {

    @Bean("dog1")
    public Dog dog() {
        System.out.println("给容器中注入dog");
        return new Dog("黑色",12,"large");
    }

    @Conditional(WinCondition.class)
    @Bean("haBaDog1")
    public Dog haBaDog() {
        System.out.println("给容器中注入haBaDog");
        return new Dog("百色",22,"small");
    }

    @Conditional(LinCondition.class)
    @Bean("langDog1")
    public Dog langDog() {
        System.out.println("给容器中注入langDog");
        return new Dog("黄色",32,"middle");
    }



}
