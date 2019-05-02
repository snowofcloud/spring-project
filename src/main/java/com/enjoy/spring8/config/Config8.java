package com.enjoy.spring8.config;

import com.enjoy.spring8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @auther xuxq
 * @date 2019/5/2 23:49
 */
@Configuration
@PropertySource(value = "classpath:/test.properties")
public class Config8 {

    @Bean
    public Bird bird(){
        return new Bird();
    }
}
