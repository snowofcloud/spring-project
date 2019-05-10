package com.enjoy.spring11.service;

import com.enjoy.spring11.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther xuxq
 * @date 2019/5/10 19:36
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void addOrder(){
        int a = 1/0;
        orderDao.insert();
        //
        System.out.println("插入数据库数据完成。。。。。。");

    }

}
