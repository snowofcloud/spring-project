package com.enjoy.spring7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @auther xuxq
 * @date 2019/5/1 20:19
 */
@Component
public class Jeep {
    public Jeep(){
        System.out.println("Jeep.....constructor........");
    }
    @PostConstruct
    public void init(){
        System.out.println("Jeep.....@PostConstruct........");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Jeep.....@PreDestroy......");
    }
}
