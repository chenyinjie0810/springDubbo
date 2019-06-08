package com.chenyinjie.user.controller;

import com.chenyinjie.user.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/8 17:32
 * 陈银杰专属测试
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String getTicket(){
        return testService.getTicket();
    }
}
