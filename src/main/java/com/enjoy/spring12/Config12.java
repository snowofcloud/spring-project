package com.enjoy.spring12;

import com.enjoy.spring9.bean.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther xuxq
 * @date 2019/5/10 22:57
 */
@Configuration
@ComponentScan("com.enjoy.spring12")
public class Config12 {

    @Bean
    public Moon getMoon(){
        return new Moon();
    }
}
