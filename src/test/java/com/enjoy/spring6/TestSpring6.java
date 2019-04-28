package com.enjoy.spring6;

import com.enjoy.spring6.config.DogConfig6;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/28 19:29
 */
public class TestSpring6 {

    @Test
    public void testSpring6() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig6.class);
        System.out.println("IOC容器创建完成");

       String[] names = app.getBeanDefinitionNames();
        for (String name :names) {
            System.out.println(name);
        }

    }
}
