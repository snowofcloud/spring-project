package com.enjoy.spring11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @auther xuxq
 * @date 2019/5/10 19:27
 */
@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert(){
        String s = "insert into t_account_info (accountId,balance) values (?,?)";
        jdbcTemplate.update(s,666,77);
    }

}
