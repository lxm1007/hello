package com.lxm.hello.com.lxm.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){
    return "现在的时间是："+new Date();
    }

    @RequestMapping("/")
    public String toHello(){
        return "rediret:hello";
    }

}
