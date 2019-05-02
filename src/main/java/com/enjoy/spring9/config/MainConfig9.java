package com.enjoy.spring9.config;

import com.enjoy.spring9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther xuxq
 * @date 2019/5/2 23:57
 */
@Configuration
@ComponentScan({"com.enjoy.spring9.controller","com.enjoy.spring9.service","com.enjoy.spring9.dao"})
public class MainConfig9 {
    //spring进行自装配的时候默认首选的bean
    //@Primary
    @Bean("testDao")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
