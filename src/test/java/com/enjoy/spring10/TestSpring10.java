package com.enjoy.spring10;

import com.enjoy.spring10.aop.Calculator;
import com.enjoy.spring10.config.Config10;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xuxq
 * @date 2019/5/3 11:41
 */
public class TestSpring10 {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config10.class);

        //Calculator c = new Calculator();
        Calculator c = app.getBean(Calculator.class);
        int result = c.div(4, 3);
        System.out.println(result);
        app.close();


    }
}
