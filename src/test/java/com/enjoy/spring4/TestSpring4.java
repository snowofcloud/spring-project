package com.enjoy.spring4;

import com.enjoy.spring4.config.DogConfig4;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/4/27 19:59
 */
public class TestSpring4 {
    @Test
    public void testSpring4() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DogConfig4.class);
        System.out.println("IOC容器创建完成。。。");
        app.getBean("dog");//执行获取的时候才创建并初始化bean
    }
}
