package com.enjoy.spring6.config;


import com.enjoy.spring6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @auther xuxq
 * @date 2019/4/28 19:38
 */
public class BobFactoryBean implements FactoryBean<Monkey> {
    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }
}
