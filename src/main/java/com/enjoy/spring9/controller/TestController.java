package com.enjoy.spring9.controller;

import com.enjoy.spring9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @auther xuxq
 * @date 2019/5/2 23:58
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;
}
