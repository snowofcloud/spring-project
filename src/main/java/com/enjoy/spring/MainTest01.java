package com.enjoy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/23 23:04
 */
public class MainTest01 {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Dog dog = (Dog) applicationContext.getBean("dog");

        System.out.println(dog.toString());

    }
}
