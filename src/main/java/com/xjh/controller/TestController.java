package com.xjh.controller;

import com.xjh.bean.User;
import com.xjh.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ColorXJH
 * @version 1.0
 * @description
 * @date 2020/9/23 19:58
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private RedisUtil util;
    @GetMapping("/getReady")
    public String getReady(){
        return "i am ready";
    }
    @GetMapping("/start")
    public String start(){
        User user=new User();
        user.setName("ColorXJH");
        user.setAge(27);
        user.setContext("我 很 酷");
        util.set("xjh",user);
        return "success";
    }
}
