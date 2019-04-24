package com.enjoy.spring;

import com.enjoy.spring.config.DogConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/25 0:04
 */
public class MainTest02 {

    public static void main(String args[]) {
        ApplicationContext aa = new AnnotationConfigApplicationContext(DogConfig.class);
        Dog dog = (Dog) aa.getBean("ddd");
        System.out.println(dog.toString());

        String[] type = aa.getBeanNamesForType(Dog.class);
        for (String name: type) {
            System.out.println(name);
        }

    }

}
