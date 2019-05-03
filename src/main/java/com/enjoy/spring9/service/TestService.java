package com.enjoy.spring9.service;

import com.enjoy.spring9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @auther xuxq
 * @date 2019/5/3 0:00
 */
@Service
public class TestService {
    //@Qualifier("testDao")
    //@Autowired(required=false)
    //效果是一样的,与Autowired一样可以装配bean
    //1,不支持Primary功能
    //2,不支持Autowired false
    //@Resource(name="testDao2")
    /*@Inject
    private TestDao testDao;*/



    @Qualifier("testDao")//指定名称来加载
    @Autowired
    private TestDao testDao;//如果使用Autowired, testDao2, 找到TestDao类型的


    public void println(){
        System.out.println(testDao);
    }
}
