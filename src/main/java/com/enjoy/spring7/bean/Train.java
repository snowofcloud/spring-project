package com.enjoy.spring7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @auther xuxq
 * @date 2019/5/1 19:37
 */
@Component
public class Train implements InitializingBean, DisposableBean {
    public Train() {
        System.out.println("Train.....Constructor.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Train.....destroy.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train.....afterPropertiesSet....");
    }
}
