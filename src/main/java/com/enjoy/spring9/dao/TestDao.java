package com.enjoy.spring9.dao;

import org.springframework.stereotype.Repository;

/**
 * @auther xuxq
 * @date 2019/5/3 0:01
 */
@Repository
public class TestDao {
    private String flag = "1";
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDao [flag=" + flag + "]";
    }
}
