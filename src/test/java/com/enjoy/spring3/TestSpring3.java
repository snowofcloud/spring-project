package com.enjoy.spring3;

import com.enjoy.spring2.config.DogConfig;
import com.enjoy.spring3.config.DogConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/27 17:39
 */
public class TestSpring3 {
    @Test
    public void testSpring2(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig3.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
        Object dog = app.getBean("dog");
        Object dog2 = app.getBean("dog");
        System.out.println(dog==dog2);
    }
}
