package com.enjoy.spring11;

import com.enjoy.spring11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.spring11.config.Config11;
/**
 * @auther xuxq
 * @date 2019/5/10 19:43
 */
public class TestSpring11 {
    @Test
    public void test011(){  //
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config11.class);
        OrderService bean = applicationContext.getBean(OrderService.class);
        bean.addOrder();
        applicationContext.close();
    }
}
