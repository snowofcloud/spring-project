package com.enjoy.spring7;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.spring7.config.MainConfigOfLifeCycle;
/**
 * @auther xuxq
 * @date 2019/5/1 19:06
 */
public class TestSpring7 {

    @Test
    public void test7(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        System.out.println("ioc容器创建完成。。。。。。。。。。。。。。");
        context.close();

    }
}
