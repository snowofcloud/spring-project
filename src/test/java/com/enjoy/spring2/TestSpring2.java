package com.enjoy.spring2;

import com.enjoy.spring2.config.DogConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/27 15:15
 */
public class TestSpring2 {

    @Test
    public void testSpring2(){
       AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
    }

}
