package com.enjoy.spring5;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.spring5.config.DogConfig5;

/**
 * @auther xuxq
 * @date 2019/4/27 22:13
 */
public class TestSpring5 {
    @Test
    public void testSpring5(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig5.class);
        System.out.println("ioc容器创建完成。。。");
        String[] names = app.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
    }

}
