package com.enjoy.spring12;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.spring12.Config12;

/**
 * @auther xuxq
 * @date 2019/5/10 23:19
 */
public class TestSpring12 {

    @Test
    public void test12(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config12.class);
        context.close();
    }
}
