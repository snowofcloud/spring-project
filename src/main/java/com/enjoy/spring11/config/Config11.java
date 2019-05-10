package com.enjoy.spring11.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @auther xuxq
 * @date 2019/5/10 14:07
 */
@Configuration
@ComponentScan("com.enjoy.spring11")

public class Config11 {

    @Bean
    public DataSource dataSource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root2");
        dataSource.setPassword("123456");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        return dataSource;
    }

    //jdbcTemplate能简化增删查改的操作
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException{
        return new JdbcTemplate(dataSource());
    }




}
