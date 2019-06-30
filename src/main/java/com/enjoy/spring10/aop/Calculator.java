package com.enjoy.spring10.aop;

/**
 * @auther xuxq
 * @date 2019/5/3 11:36
 */
public class Calculator {
    //业务逻辑方法
    public int div(int i, int j){
        System.out.println("--------");
        return i/j;
    }
}