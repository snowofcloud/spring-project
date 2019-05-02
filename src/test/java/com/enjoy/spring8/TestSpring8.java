package com.enjoy.spring8;

import com.enjoy.spring8.bean.Bird;
import com.enjoy.spring8.config.Config8;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @auther xuxq
 * @date 2019/5/2 23:52
 */
public class TestSpring8 {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config8.class);
        //从容器中获取所有bean
        String[] names = app.getBeanDefinitionNames();

        for(String name:names){
            System.out.println(name);
        }
        Bird bird = (Bird) app.getBean("bird");

        System.out.println(bird);
        System.out.println("IOC容器创建完成........");



        ConfigurableEnvironment environment = app.getEnvironment();
        System.out.println("environment===="+environment.getProperty("bird.color"));
        app.close();





    }
}
