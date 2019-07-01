package com.enjoy.spring11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;


/**
 * @auther xuxq
 * @date 2019/5/10 19:27
 */
@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert(){ //insert into tbname values (null,'bbb','123',23,'1993-09-01');
        //String s = "insert into order (ordertime,ordermoney,orderstatus) values (new Date(),19,0)";
        //String s = "insert into order values (1,new Date(),19,0)";
        //jdbcTemplate.execute(s);//update(s,new Date(),19,0);

        //insert into tbname (id,username,password) values (null,'aaa','123');
        String s = "insert into orderr ( ordertime, ordermoney, orderstatus) values (?,?,?)";
        jdbcTemplate.update(s,new Date(),20,0);
        //check the manual that corresponds to your MySQL server version for the right
       // 忘记order是mysql的关键字了，我用order做为表名，死活插不进去数据
    }

}
